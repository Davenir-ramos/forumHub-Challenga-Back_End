package br.com.alura.forumHub.Repository;

import br.com.alura.forumHub.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
}
