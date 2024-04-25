package modelo;

import java.io.File;
import java.util.Objects;
import javax.servlet.http.Part;

public class Peliculas {
    
    private String nombrePelicula, nombreOriginal, resenas, sinopsis;
    private int idPelicula;
    private Object portada;

    public Peliculas() {
        
    }

    public Peliculas(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }
    
    
    

    public Peliculas(String nombrePelicula, String nombreOriginal, String reseñas, String sinopsis, Object portada, int idPelicula) {
        this.nombrePelicula = nombrePelicula;
        this.nombreOriginal = nombreOriginal;
        this.resenas = reseñas;
        this.sinopsis = sinopsis;
        this.portada = portada;
        this.idPelicula = idPelicula;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public String getNombreOriginal() {
        return nombreOriginal;
    }

    public void setNombreOriginal(String nombreOriginal) {
        this.nombreOriginal = nombreOriginal;
    }

    public String getReseñas() {
        return resenas;
    }

    public void setResenas(String reseñas) {
        this.resenas = reseñas;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public Object getPortada() {
        return portada;
    }

    public void setPortada(Object portada) {
        this.portada = portada;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Peliculas other = (Peliculas) obj;
        if (!Objects.equals(this.nombrePelicula, other.nombrePelicula)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
