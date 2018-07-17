package pe.transportesscaramutti.Backend.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIO")
@Data
public class Usuario {

    @Id
    @Column(name = "CODIGO_USUARIO")
    private Integer codigoUsuario;
    @Column(name = "NOMBRE_USUARIO",length = 250)
    private String nombreUsuario;
    @Column(name = "CONTRASEÑA",length = 250)
    private String contraseña;
}
