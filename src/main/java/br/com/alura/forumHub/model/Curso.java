package br.com.alura.forumHub.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
//@Entity(name= "Curso")
//@Table(name= "cursos")
public class Curso {

    //    @Id
//    @GeneratedValue(strategy = GeneratedType.IDENTITY)
    private Long id;
    private String nome;
    private String categoria;
}
