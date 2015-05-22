package puntoventa_1_0_0;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

public abstract class EntidadGenerica implements Serializable {

    public EntidadGenerica() {
        id = -1;
        nombre = "";
    }
    
    public EntidadGenerica(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    public void setId(int id) {
        this.id = id;        
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String guardaEnArchivo(String archivo) {
        EntidadGenerica generico = new EntidadGenerica() {};
        generico = leeDeArchivo(archivo, generico, id);
        if (generico != null) {
            return "El registro ya existe";
        }
        try {
            FileOutputStream fos = new FileOutputStream(archivo, true);
            try (ObjectOutputStream fout = new ObjectOutputStream(fos)) {
                fout.writeObject(this);
            }
            return "Registro guardado en archivo";
        } catch (Exception ex) {
            return ex.getMessage();
        }
    }

    public EntidadGenerica leeDeArchivo(String archivo, EntidadGenerica entidad,
            int id) {
        try {
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream fin = new ObjectInputStream(fis);
            entidad = (EntidadGenerica) fin.readObject();
            while (entidad.id != id) {
                fin = new ObjectInputStream(fis);
                entidad = (EntidadGenerica) fin.readObject();
            }
            fin.close();
            if (entidad.id == id) {
                return entidad;
            } else {
                return null;
            }
        } catch (IOException | ClassNotFoundException ex) {
            return null;
        }
    }
    
    public int getLastId(String archivo) {
        EntidadGenerica entidad = new EntidadGenerica() {};
        EntidadGenerica registro = null;
        int id = 0;
        do {
            registro = entidad.leeDeArchivo(archivo, entidad, id);
            if (registro != null) {
                ++id;
            } else {
                return id;
            }
        } while (true);
    }
    
    public List<EntidadGenerica> leeTodoDeArchivo(String archivo) {
        EntidadGenerica entidad = new EntidadGenerica() {};
        EntidadGenerica registro = null;
        List lista = new ArrayList();
        int id = 0;
        do {
            registro = entidad.leeDeArchivo(archivo, entidad, id);
            if (registro != null) {
                lista.add(registro);
                ++id;
            } else {
                return lista;
            }
        } while (true);
    }
    
    private int id;
    private String nombre;
    public static final long serialVersionUID = 1L;
}
