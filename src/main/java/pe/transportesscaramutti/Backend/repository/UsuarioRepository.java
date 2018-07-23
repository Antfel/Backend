package pe.transportesscaramutti.Backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.transportesscaramutti.Backend.model.Usuario;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
    Optional<Usuario> findByNombreUsuario(String nombreUsuario);

    Optional<Usuario> findByNombreUsuarioOrEmail(String username, String email);

    Boolean existsByNombreUsuario(String username);

    Boolean existsByEmail(String email);
}
