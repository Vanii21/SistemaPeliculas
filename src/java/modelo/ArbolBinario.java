package modelo;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author vanii
 */
public class ArbolBinario {
    
    public NodoArbol raiz;
    public NodoArbol aux;
    public NodoArbol padre;

    public ArbolBinario() {
        
        raiz = null;
        aux = null;
        padre = null;
        
    }
    
    public void agregarNodo( Actor d ){
        
        NodoArbol nuevo = new NodoArbol(d);
        if(raiz == null){
            raiz = nuevo;
        }else{
            aux = raiz;
            while(true){
                padre = aux;
                if(d.getNombre().compareTo(aux.dato.getNombre()) < 0){
                    aux = aux.hijoIzquierdo;
                    if(aux == null){
                        padre.hijoIzquierdo = nuevo;
                        return;
                    }
                }else{
                    aux = aux.hijoDerecho;
                    if(aux == null){
                        padre.hijoDerecho = nuevo;
                        return;
                    }
                }
            }
        }
    }
    
    public Boolean estaVacio(){
        
        return raiz == null;
    }
    
    public ArrayList inOrden(NodoArbol r, ArrayList<Actor> arr){

        if(r != null){

            inOrden(r.hijoIzquierdo, arr);
            arr.add(r.dato);
            inOrden(r.hijoDerecho, arr);
            
        }
        
        return arr;
        
    }
    
    public ArrayList inOrdenCon(NodoArbol r, ArrayList<Actor> arr){

        if(r != null){

            inOrdenCon(r.hijoIzquierdo, arr);
            System.out.println(r.dato);
            inOrdenCon(r.hijoDerecho, arr);
            
        }
        
        return arr;
        
    }
    
    public void elimnar(Actor actor){
        
        raiz = eliminarN(raiz, actor);
        
    }
    
    public NodoArbol eliminarN(NodoArbol aux, Actor actor){
        if(aux == null){
            System.out.println("Nodo no encontrado");
        }else if(actor.getNombre().compareTo(aux.dato.getNombre()) < 0){
            NodoArbol iz = eliminarN(aux.hijoIzquierdo, actor);
            aux.hijoIzquierdo = iz; 
        }else if(actor.getNombre().compareTo(aux.dato.getNombre()) > 0){
            NodoArbol der = eliminarN(aux.hijoDerecho, actor);
            aux.hijoDerecho = der;
        }else{
            padre = aux;
            if(padre.hijoDerecho == null){
                aux = padre.hijoIzquierdo;
            }else if(padre.hijoIzquierdo == null){
                aux = padre.hijoDerecho;
            }else{
                padre = cambiar(padre);
            }
            padre = null;
        }
        return aux;
    }
    
    public NodoArbol cambiar(NodoArbol aux){
        padre = aux;
        NodoArbol a = aux.hijoIzquierdo;
        
        while(a.hijoDerecho!= null){
            padre = a;
            a = a.hijoDerecho;
        }
        aux.dato = a.dato;
        
        if(padre == aux)
            padre.hijoIzquierdo = a.hijoIzquierdo;
        else
            padre.hijoDerecho = a.hijoIzquierdo;
            return a;
            
    }
    
}
