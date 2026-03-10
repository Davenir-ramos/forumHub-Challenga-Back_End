package br.com.alura.forumHub.Dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroTopico(
        @NotBlank String titulo,
       @NotBlank String mensagem,
        @NotNull Long idAutor,
        @NotNull Long idCurso
) {}
