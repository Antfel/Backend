package pe.transportesscaramutti.Backend.repository;

import org.springframework.data.repository.CrudRepository;
import pe.transportesscaramutti.Backend.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

    Cliente findByRucCliente(String rucCliente);

    Cliente findByRazonCliente(String razonCliente);

}
