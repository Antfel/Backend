package pe.transportesscaramutti.Backend.dto;

public interface FacturaResponse {
    String getCodigo();

    String getSerie();

    String getNroFactura();

    String getRuc();

    String getRazonSocial();

    String getFechaFactura();

    String getMoneda();

    String getSubTotal();

    String getIgv();

    String getTotalFactura();

    String getEstadoFactura();

    String getCodigoTipo();

    String getTipoFactura();

    String getFechaRecepcion();

    String getFechaVencimiento();

    String getFechaPago();

    String getCodigoEstado();

    String getFechaCompromiso();

    String getNombreBanco();
}
