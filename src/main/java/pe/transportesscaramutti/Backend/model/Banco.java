package pe.transportesscaramutti.Backend.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BANCO")
@Data
public class Banco {

    @Id
    @Column(name = "CODIGO_BANCO")
    private Integer codigoBanco;
    @Column(name = "NOMBRE_BANCO",length = 150)
    private String nombreBanco;
    @Column(name = "ABREVIATURA",length = 150)
    private String abreviatura;

}
