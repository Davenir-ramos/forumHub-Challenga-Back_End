package br.com.alura.forumHub.controller;

import br.com.alura.forumHub.Dto.DadosAtualizacaoTopico;
import br.com.alura.forumHub.Dto.DadosCadastroTopico;
import br.com.alura.forumHub.Dto.DadosDetalhamentoTopico;
import br.com.alura.forumHub.Dto.DadosListagemTopico;
import br.com.alura.forumHub.Repository.CursoRepository;
import br.com.alura.forumHub.Repository.TopicoRepository;
import br.com.alura.forumHub.Repository.UsuarioRepository;
import br.com.alura.forumHub.model.Topico;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.awt.print.Pageable;

@RestController
@RequestMapping("/topicos")
public class TopicoController {
    @Autowired
    private TopicoRepository repository;
    @Autowired
    private UsuarioRepository usuarioRepository; // Você precisará criar este também
    @Autowired
    private CursoRepository cursoRepository; // E este também
    private Long id;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid DadosCadastroTopico dados,
                                    UriComponentsBuilder uriBuilder) {

        // 1. Validar se o curso existe
        var autor = cursoRepository.getReferenceById(dados.idAutor());
        var curso = cursoRepository.getReferenceById(dados.idCurso());

        // 2. Criamos a entidade Tópico com esses dados
        var topico = new Topico(dados, curso, autor);

        // 3. Salvamos no banco
        repository.save(topico);

        // 4. Retornamos o status 201 (Created) e o endereço do novo recurso
        var uri = uriBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();
        return ResponseEntity.created(uri).body("Tópico criado com sucesso!");
    }

    @GetMapping("/{id}")
    public ResponseEntity detalhar(@PathVariable Long id) {
        var topico = repository.getReferenceById(id);
        return ResponseEntity.ok(topico);
    }

    @GetMapping
    public ResponseEntity<Page<DadosListagemTopico>> listar(
            @PageableDefault(size = 10, sort = {"dataCriacao"},
                    direction = Sort.Direction.DESC) Pageable paginacao) {

        // O repository.findAll(paginacao) já faz o SQL com LIMIT e OFFSET automaticamente
        var pagina = repository.findAll((Sort) paginacao).map(DadosListagemTopico::new);
        return ResponseEntity.ok(pagina);
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity atualizar(@PathVariable Long id,
                                    @RequestBody
                                    @Valid DadosAtualizacaoTopico dados) {
        var topico = repository.getReferenceById(id);
        // Aqui a JPA detecta a mudança e atualiza o banco ao final do método (Dirty Checking)
        topico.setTitulo(dados.titulo());
        topico.setMensagem(dados.mensagem());
        return ResponseEntity.ok(new DadosDetalhamentoTopico(topico));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity excluir(@PathVariable Long id) {
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }


}
