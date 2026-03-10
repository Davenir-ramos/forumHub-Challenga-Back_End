package br.com.alura.forumHub.Repository;

import br.com.alura.forumHub.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
