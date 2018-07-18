package pe.transportesscaramutti.Backend.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import pe.transportesscaramutti.Backend.dtoResponse.FacturaResponse;
import pe.transportesscaramutti.Backend.model.Factura;

import java.util.List;

public interface FacturaRepository extends CrudRepository<Factura, Integer> {

    @Query(value = "select a.CODIGO_FACTURA as codigo," +
            "a.SERIE_FACTURA as serie," +
            "a.NUMERO_FACTURA as nroFactura," +
            "b.RUC_CLIENTE as ruc," +
            "b.RAZON_CLIENTE as razonSocial," +
            "convert(varchar(10), a.FECHA_FACTURA, 103) as fechaFactura," +
            "c.DETALLE_MONEDA as moneda," +
            "cast(round(a.SUBTOTAL, 2)as numeric(9, 2)) as subTotal," +
            "cast(round(a.IGV,2) as numeric(9,2)) as  igv," +
            "cast(round(a.TOTAL_FACTURA,2) as numeric(9,2)) as totalFactura," +
            "d.DETALLE_ESTADO as estadoFactura," +
            "a.TIPO_FACTURA as codigoTipo," +
            "e.DETALLE_ESTADO as tipoFactura," +
            "convert(varchar(10),a.FECHA_RECEPCION,103) as fechaRecepcion," +
            "convert(varchar(10),a.FECHA_VENCIMIENTO,103) as fechaVencimiento," +
            "convert(varchar(10),a.FECHA_PAGO,103) as fechaPago," +
            "a.CODIGO_ESTADO as codigoEstado," +
            "convert(varchar(10),a.FECHA_COMPROMISO,103) as fechaCompromiso," +
            "f.NOMBRE_BANCO as nombreBanco " +
            "from FACTURA a " +
            "LEFT JOIN CLIENTE b on a.CODIGO_CLIENTE=b.CODIGO_CLIENTE " +
            "LEFT JOIN MONEDA c on a.CODIGO_MONEDA =c.CODIGO_MONEDA " +
            "LEFT JOIN ESTADO d on a.CODIGO_ESTADO =d.CODIGO_ESTADO " +
            "LEFT JOIN ESTADO e on a.TIPO_FACTURA= e.CODIGO_ESTADO and e.TIPO_ESTADO = 7 " +
            "LEFT JOIN BANCO f on f.CODIGO_BANCO=a.CODIGO_BANCO " +
            "order by a.NUMERO_FACTURA", nativeQuery = true)
    List<FacturaResponse> findProjectedNativeQuery();
}
