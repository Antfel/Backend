package pe.transportesscaramutti.Backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.transportesscaramutti.Backend.dtoResponse.FacturaResponse;
import pe.transportesscaramutti.Backend.model.Factura;
import pe.transportesscaramutti.Backend.repository.FacturaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class FacturaService {

    @Autowired
    private FacturaRepository facturaRepository;

    public Optional<Factura> findByCodigoFactura(Integer codigoFactura) {
        return facturaRepository.findById(codigoFactura);
    }

    public List<Factura> findAllFacturas() {
        return (List<Factura>) facturaRepository.findAll();
    }

    public List<FacturaResponse> findAllFacturasResponse() {
        return facturaRepository.findProjectedNativeQuery();
    }

}
