package puntoventa_1_0_0;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RegistroVenta implements Serializable {
    
    public RegistroVenta() {
        id = -1;
        descripcion = "";
        precio = 0.0;
        cantidad = 0;
        monto = 0.0;
        fecha = null;
    }
    
    public RegistroVenta(int id, String descripcion, double precio, int cantidad, 
            double monto, Date fecha) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.monto = monto;
        this.fecha = fecha;
    }
    
    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getMonto() {
        return monto;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static String getRegistroVentaNombreArchivo() {
        return registroVentaNombreArchivo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public String registraVenta() {
        try {
            FileOutputStream fos =
                    new FileOutputStream(registroVentaNombreArchivo, true);
            try (ObjectOutputStream fout = new ObjectOutputStream(fos)) {
                fout.writeObject(this);
            }
            return "Registro guardado en archivo";
        } catch (Exception ex) {
            return ex.getMessage();
        }
    }
    
    public List<RegistroVenta> leeTodoDeArchivo() {
        List<RegistroVenta> lista = new ArrayList();
        try {
            FileInputStream fis 
                    = new FileInputStream(registroVentaNombreArchivo);
            try {
                RegistroVenta v = null;
                do {
                    ObjectInputStream fin = new ObjectInputStream(fis);
                    v = (RegistroVenta) fin.readObject();
                    if (v != null) {
                        lista.add(v);
                    }
                } while (v != null);
            } catch (Exception ex) {
                return lista;
            }
            return lista;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }
    
    private int id;
    private String descripcion;
    private double precio;
    private int cantidad;
    private double monto;
    private Date fecha;
    public static final long serialVersionUID = 1L;
    public static final String registroVentaNombreArchivo 
            = "./registro_venta.bin";
}
