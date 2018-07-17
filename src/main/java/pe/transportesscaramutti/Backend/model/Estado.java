package pe.transportesscaramutti.Backend.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ESTADO")
@Data
public class Estado {

    @Id
    @Column(name = "CODIGO_ESTADO")
    private Integer codigoEstado;
    @Column(name = "TIPO_ESTADO")
    private Integer tipoServicio;
    @Column(name = "DESCRIPCION",length = 50)
    private String descripcion;
    @Column(name = "DETALLE_ESTADO",length = 50)
    private String detalleEstado;
    @Column(name = "DETALLE_ESTADO_COMPLETO",length = 100)
    private String detalleEstadoCompleto;
}
