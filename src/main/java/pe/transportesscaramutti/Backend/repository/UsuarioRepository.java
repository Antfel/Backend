package pe.transportesscaramutti.Backend.repository;

import org.springframework.data.repository.CrudRepository;
import pe.transportesscaramutti.Backend.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
    Usuario findByNombreUsuario(String nombreUsuario);
}
