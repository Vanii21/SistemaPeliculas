package modelo;

import java.util.Objects;

/**
 *
 * @author vanii
 */
public class Actor {
    
    public String nombre, nombreO, nombrePelicula;
    public int id, genero; 
    public Object foto;

    public Actor(String nombre) {
        this.nombre = nombre;
    }
    
    

    public Actor(String nombre, String nombreO, String nombrePelicula, int id, int genero, Object foto) {
        this.nombre = nombre;
        this.nombreO = nombreO;
        this.nombrePelicula = nombrePelicula;
        this.id = id;
        this.genero = genero;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreO() {
        return nombreO;
    }

    public void setNombreO(String nombreO) {
        this.nombreO = nombreO;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public Object getFoto() {
        return foto;
    }

    public void setFoto(Object foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Actor{" + "nombre=" + nombre + ", nombreO=" + nombreO + ", nombrePelicula=" + nombrePelicula + ", id=" + id + ", genero=" + genero + ", foto=" + foto + '}';
    }

    
    
}
