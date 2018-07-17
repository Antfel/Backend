package pe.transportesscaramutti.Backend.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "CLIENTE")
@Data
public class Cliente {

    @Id
    @Column(name = "CODIGO_CLIENTE")
    private Integer codigoCliente;
    @Column(name = "RUC_CLIENTE",length = 11)
    private String rucCliente;
    @Column(name = "RAZON_CLIENTE",length = 400)
    private String razonCliente;
    @Column(name = "DIRECCION_CLIENTE")
    private String direccionCliente;
    @Column(name = "TELEFONO_CLIENTE")
    private String telefonoCliente;
}
