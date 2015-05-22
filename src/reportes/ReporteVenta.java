package reportes;

import puntoventa_1_0_0.RegistroVenta;

public class ReporteVenta {
    public ReporteVenta(RegistroVenta v) {
        id = String.valueOf(v.getId());
        descripcion = v.getDescripcion();
        precio = String.valueOf(v.getPrecio());
        cantidad = String.valueOf(v.getCantidad());
        monto = String.valueOf(v.getMonto());
        fecha = String.valueOf(v.getFecha());
    }

    public String getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public String getCantidad() {
        return cantidad;
    }

    public String getMonto() {
        return monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    private String id;
    private String descripcion;
    private String precio;
    private String cantidad;
    private String monto;
    private String fecha;
}
