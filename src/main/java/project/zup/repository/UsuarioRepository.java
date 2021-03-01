package project.zup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.zup.domain.Usuario;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByEmail(String email);
}
