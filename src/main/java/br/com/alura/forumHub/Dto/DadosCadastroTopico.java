package br.com.alura.forumHub.Dto;

public record DadosCadastroTopico(
//        @NotBlank String titulo,
//       @NotBlank String mensagem,
//        @NotBlank Long idAutor,
//        @NotBlank Long idCurso
         String titulo,
         String mensagem,
         String autor,
         String curso,
         String respostas
) {
}
