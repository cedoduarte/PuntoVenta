package puntoventa_1_0_0;

import java.util.ArrayList;
import java.util.List;

public class EntidadCliente extends EntidadGenerica {

    public EntidadCliente() {
        direccion = "";
        telefono = "";
        email = "";
    }
    
    public EntidadCliente(int id, String nombre, String direccion, 
            String telefono, String email) {
        super(id, nombre);
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }
    
    public EntidadCliente(String direccion, String telefono, String email) {
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }
    
    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String guardaEnArchivo() {
        return super.guardaEnArchivo(clienteNombreArchivo);
    }

    public EntidadCliente leeDeArchivo(EntidadCliente entidad,
            int id) {
        return (EntidadCliente) super.leeDeArchivo(clienteNombreArchivo, 
                entidad, id);
    }
    
    public int getLastId() {
        return super.getLastId(clienteNombreArchivo);
    }
    
    public List<EntidadCliente> leeTodoDeArchivo() {
        List<EntidadCliente> lista = new ArrayList();
        List<EntidadGenerica> listaGenerica =
                super.leeTodoDeArchivo(clienteNombreArchivo);
        for (EntidadGenerica e : listaGenerica) {
            lista.add((EntidadCliente) e);
        }
        return lista;
    }
    
    private String direccion;
    private String telefono;
    private String email;
    public static final String clienteNombreArchivo = "./cliente.bin";
}
