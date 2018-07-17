package pe.transportesscaramutti.Backend.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "FACTURA")
@Data
public class Factura {

    @Id
    @Column(name = "CODIGO_FACTURA")
    private Integer codigoFactura;
    @Column(name = "SERIE_FACTURA",length = 11)
    private String serieFactura;
    @Column(name = "NUMERO_FACTURA",length = 11)
    private String numeroFactura;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CODIGO_CLIENTE")
    private Cliente cliente;
    @Column(name = "SUBTOTAL",length = 12,precision = 2)
    private Double subtotal;
    @Column(name = "IGV",length = 12,precision = 2)
    private Double igv;
    @Column(name = "TOTAL_FACTURA",length = 12,precision = 2)
    private Double totalFactura;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CODIGO_MONEDA")
    private Moneda moneda;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CODIGO_ESTADO")
    private Estado estado;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_FACTURA")
    private Date fechaFactura;
    @Column(name = "TIPO_FACTURA")
    private int tipoFactura;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_PAGO")
    private Date fechaPago;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_RECEPCION")
    private Date fechaRecepcion;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_VENCIMIENTO")
    private Date fechaVencimiento;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_COMPROMISO")
    private Date fechaCompromiso;
    @Column(name = "PORCENTAJE_DETRACCION",length = 12,precision = 2)
    private Double procentajeDetraccion;
    @Column(name = "MONTO_DETRACCION",length = 12,precision = 2)
    private Double montDetraccion;
    @Column(name = "CODIGO_BANCO")
    private String codigoBanco;
    @Column(name = "ACTUALIZADO")
    private String actualizado;
    @Column(name = "ID_VENTA")
    private String idVenta;
    @Column(name = "SERIE_DOCUMENTO")
    private String serieDocumento;
    @Column(name = "CORRELATIVO_DOCUMENTO")
    private String correlativoDocumento;
    @Column(name = "TIPO_CAMBIO", length = 8, precision = 4)
    private Double tipoCambio;
    @Column(name = "AFECTA_DETRACCION")
    private String afectaDetraccion;
    @Column(name = "ID_MONEDA")
    private String idMoneda;
    @Column(name = "NRO_DOCUMENTO")
    private String nroDocumento;
    @Column(name = "MES")
    private String mes;
    @Column(name = "PERIODO")
    private String periodo;

}
