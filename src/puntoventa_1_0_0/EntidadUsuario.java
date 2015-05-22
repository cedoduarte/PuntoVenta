package puntoventa_1_0_0;

import java.util.ArrayList;
import java.util.List;
import static puntoventa_1_0_0.EntidadCliente.clienteNombreArchivo;

public class EntidadUsuario extends EntidadGenerica {

    public EntidadUsuario(int id, String nombre, String contrasenya) {
        super(id, nombre);
        this.contrasenya = contrasenya;
    }
    
    public EntidadUsuario() {
        this.contrasenya = "";
    }

    public String getContrasenya() {
        return contrasenya;
    }
    
    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }
    
    public String guardaEnArchivo() {
        return super.guardaEnArchivo(usuarioNombreArchivo);
    }

    public EntidadUsuario leeDeArchivo(EntidadUsuario entidad,
            int id) {
        return (EntidadUsuario) super.leeDeArchivo(usuarioNombreArchivo, 
                entidad, id);
    }
    
    public int getLastId() {
        return super.getLastId(usuarioNombreArchivo);
    }
    
    public List<EntidadUsuario> leeTodoDeArchivo() {
        List<EntidadUsuario> lista = new ArrayList();
        List<EntidadGenerica> listaGenerica =
                super.leeTodoDeArchivo(usuarioNombreArchivo);
        for (EntidadGenerica e : listaGenerica) {
            lista.add((EntidadUsuario) e);
        }
        return lista;
    }
    
    private String contrasenya;
    public static final String usuarioNombreArchivo = "./usuario.bin";
}
