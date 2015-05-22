package puntoventa_1_0_0;

import java.util.ArrayList;
import java.util.List;

public class EntidadProducto extends EntidadGenerica {
    
    public EntidadProducto() {
        precio = 0.0;
    }
    
    public EntidadProducto(int id, String nombre, double precio) {
        super(id, nombre);
        this.precio = precio;
    }
    
    public EntidadProducto(double precio) {
        this.precio = precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public String guardaEnArchivo() {
        return super.guardaEnArchivo(productoNombreArchivo);
    }

    public EntidadProducto leeDeArchivo(EntidadProducto entidad,
            int id) {
        return (EntidadProducto) super.leeDeArchivo(productoNombreArchivo, 
                entidad, id);
    }
    
    public int getLastId() {
        return super.getLastId(productoNombreArchivo);
    }
    
    public List<EntidadProducto> leeTodoDeArchivo() {
        List<EntidadProducto> lista = new ArrayList();
        List<EntidadGenerica> listaGenerica =
                super.leeTodoDeArchivo(productoNombreArchivo);
        for (EntidadGenerica e : listaGenerica) {
            lista.add((EntidadProducto) e);
        }
        return lista;
    }
    
    private double precio;
    public static final String productoNombreArchivo = "./producto.bin";
}
