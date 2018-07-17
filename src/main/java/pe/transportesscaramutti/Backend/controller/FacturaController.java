package pe.transportesscaramutti.Backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.transportesscaramutti.Backend.model.Factura;
import pe.transportesscaramutti.Backend.service.FacturaService;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path = "/api/")
public class FacturaController {

    @Autowired
    private FacturaService facturaService;

    @GetMapping(value = "factura/all")
    public ResponseEntity<List<Factura>> listAllFacturas() {
        List<Factura> facturas = facturaService.findAllFacturas();
        if (facturas.isEmpty()) {
            return new ResponseEntity<List<Factura>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Factura>>(facturas, HttpStatus.OK);
    }

}
