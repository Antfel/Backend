package pe.transportesscaramutti.Backend.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "MONEDA")
@Data
public class Moneda {

    @Id
    @Column(name = "CODIGO_MONEDA")
    private Integer codigoMoneda;
    @Column(name = "DETALLE_MONEDA",length = 18)
    private String detalleMoneda;
    @Column(name = "SIMBOLO",length = 10)
    private String simbolo;
}
