package pe.transportesscaramutti.Backend.repository;

import org.springframework.data.repository.CrudRepository;
import pe.transportesscaramutti.Backend.model.Factura;

public interface FacturaRepository extends CrudRepository<Factura, Integer> {
}
