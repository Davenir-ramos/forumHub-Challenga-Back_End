package br.com.alura.forumHub.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.annotation.processing.Generated;
import java.time.LocalDateTime;

//@Entity(nome = "Topico")
//@Table(name = "topicos")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

//    @Id
//    @GeneratedValue(strategy = GeneratedType.IDENTITY)
    private Long id;
    private  String titulo;
    private LocalDateTime dateTCriacao = LocalDateTime.now();

  //  @Enumerated(EnumTypy.String)
   // private StatusTopico status = StatusTopico.NAO_RESPONDIDO;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "autor_id")
    private Usuario autor;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "curso_id")

    private Curso curso;

  //  @OneToMany(mappedBy = "topico", cascade = CascadeType.ALL)
    //private List<Resposta> respostas = new ArrayList<>();


}
