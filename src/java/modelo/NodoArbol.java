/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author vanii
 */
public class NodoArbol {
    
    public Actor dato;
    NodoArbol hijoIzquierdo, hijoDerecho;

    public NodoArbol(Actor dato) {
        
        this.dato = dato;
        hijoIzquierdo = null;
        hijoDerecho = null;
        
    }

    @Override
    public String toString() {
        return "NodoArbol{" + "dato=" + dato + '}';
    }

    
    
    
    
}
