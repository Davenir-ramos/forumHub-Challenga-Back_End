package br.com.alura.forumHub.Dto;

import br.com.alura.forumHub.model.StatusTopico;
import br.com.alura.forumHub.model.Topico;

import java.time.LocalDateTime;

public record DadosListagemTopico(Long id, String titulo, String mensagem, LocalDateTime dataCriacao,
        StatusTopico status, String autor, String curso
) {

    public DadosListagemTopico(Topico topico) {
        this(topico.getId(),
                topico.getTitulo(),
                topico.getMensagem(),
                topico.getDataCriacao(),
                topico.getStatus(),
                topico.getAutor().getNome(),
                topico.getCurso().getNome());
    }
}
