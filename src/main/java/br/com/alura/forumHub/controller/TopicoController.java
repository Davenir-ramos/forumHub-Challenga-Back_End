package br.com.alura.forumHub.controller;

import br.com.alura.forumHub.Dto.DadosCadastroTopico;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topicos")
public class TopicoController {
 //   @Autowired
  //  private TopicoRepository repository;
  //  @Autowired
  //  private UsuarioRepository usuarioRepository; // Você precisará criar este também
  //  @Autowired
  //  private CursoRepository cursoRepository; // E este também
/*
    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid DadosCadastroTopico dados, UriComponentsBuilder uriBuilder) {
// 1. Buscamos as referências do Autor e do Curso no banco
        var autor = usuarioRepository.getReferenceById(dados.idAutor());
        var curso = cursoRepository.getReferenceById(dados.idCurso());

// 2. Criamos a entidade Tópico com esses dados
        var topico = new Topico(null, dados.titulo(), dados.mensagem(), LocalDateTime.now(), StatusTopico.NAO_RESPONDIDO, autor, curso, new ArrayList<>());
// 3. Salvamos no banco
        repository.save(topico);
// 4. Retornamos o status 201 (Created) e o endereço do novo recurso
        var uri = uriBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();
        return ResponseEntity.created(uri).body(new DadosDetalhamentoTopico(topico));
/*

 */
    @PostMapping
    public  void cadastrar(@RequestBody DadosCadastroTopico dados){
        System.out.println(dados);

    }
}
