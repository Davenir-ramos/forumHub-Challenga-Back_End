package br.com.alura.forumHub.Dto;

import jakarta.validation.constraints.NotBlank;

public record DadosAtualizacaoTopico(@NotBlank String titulo,
                                     @NotBlank String mensagem) {

}
