package pe.transportesscaramutti.Backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.transportesscaramutti.Backend.model.NombreRol;
import pe.transportesscaramutti.Backend.model.Rol;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {

    Optional<Rol> findByNombreRol(NombreRol nombreRol);
}
