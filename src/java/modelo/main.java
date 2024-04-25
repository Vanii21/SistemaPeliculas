package modelo;

import java.util.ArrayList;
import javax.servlet.http.Part;

public class main {

    public static void main(String[] args) {
        /*
        ListaCircular<Peliculas> listaPeliculas = new ListaCircular<Peliculas>();
        
        listaPeliculas.agregarPelicula(new Peliculas("Batman", "Bat", "Muy Buena", "Trata de murcielagos", null));
        listaPeliculas.agregarPelicula(new Peliculas("Ralft", "Ralft", "Muy Buena", "Trata de murcielagos", null));
        listaPeliculas.agregarPelicula(new Peliculas("Uncharted", "Unc", "Muy Buena", "Trata de murcielagos", null));
        listaPeliculas.agregarPelicula(new Peliculas("Conjuro", "Con", "Muy Buena", "Trata de murcielagos", null));
        
        listaPeliculas.recorrerLista();
        
        listaPeliculas.editarPelicula(new Peliculas("Batman"),new Peliculas("Bat", "B", "Muy", "Trata", null));
        
        listaPeliculas.recorrerLista();
        
        
        //System.out.println(p.getDato().toString());
        
        /*
        ListasEnlazadasDobles<Peliculas> listaPeliculas2 = new ListasEnlazadasDobles<Peliculas>();
        
        listaPeliculas2.ingresarPelicula(new Peliculas("Batman", "Bat", "Muy Buena", "Trata de murcielagos", null));
        listaPeliculas2.ingresarPelicula(new Peliculas("Ralft", "Ralft", "Muy Buena", "Trata de murcielagos", null));
        listaPeliculas2.ingresarPelicula(new Peliculas("Conjuro", "Con", "Muy Buena", "Trata de murcielagos", null));
        
        
        System.out.println("La pelicula modificada es: ");
        listaPeliculas2.modificarPeliculaP(new Peliculas("Conjuro2"), new Peliculas("Con", "C", "M", "Trata", null));
        
        listaPeliculas2.recorrerListaDoble();
        */
        
        ArbolBinario arbol = new ArbolBinario();
        ArrayList<Actor> arr = new ArrayList<Actor>();
   
        arbol.agregarNodo(new Actor("Holland","Tom", "Spiderman",1001, 1, "Spiderman.jpg"));
        arbol.agregarNodo(new Actor("Zendaya","MJ", "Spiderman No way home",1002, 2, "SpidermanHome.jpg"));
        arbol.agregarNodo(new Actor("Toby","Maguayer", "Amazing Spiderman",1003, 1, "SpidermanAmazing.jpg"));
        arbol.agregarNodo(new Actor("Halland","", "Spiderman",1001, 1, "Spiderman.jpg"));
        /*
        if(!arbol.estaVacio()){
            arbol.inOrden(arbol.raiz, arr);
        }else{
            System.out.println("ESTA VACIO EL ARBOL!!!");
        }
        
        for(Actor e : arr){
            System.out.println(e);
        }
        */
        
        System.out.println("Actor eliminado!!!");
        if(!arbol.estaVacio()){
            arbol.inOrdenCon(arbol.raiz, arr);
        }else{
            System.out.println("ESTA VACIO EL ARBOL!!!");
        }
        
        for(Actor e : arr){
            System.out.println(e);
        }
        
        arbol.elimnar(new Actor("Toby"));
        
        
        System.out.println("Actor eliminado!!!");
        if(!arbol.estaVacio()){
            arbol.inOrdenCon(arbol.raiz, arr);
        }else{
            System.out.println("ESTA VACIO EL ARBOL!!!");
        }
        
        for(Actor e : arr){
            System.out.println(e);
        }
        
    }
    
}
