package modelo;

public class ListaCircular<T> {

    public Nodo<T> primero;
    public Nodo<T> actual;
    public Nodo<T> ultimo;
    public Nodo<T> anterior;

    public ListaCircular() {

        primero = null;
        actual = null;
        ultimo = null;
        anterior = null;

    }

    public void agregarPelicula(T pelis) {
        
        Nodo<T> nuevaPeli = new Nodo<T>(pelis);

        nuevaPeli.setDato(pelis);

        if (primero == null) {
            primero = nuevaPeli;
            ultimo = primero;
            primero.setSiguiente(ultimo);
        } else {
            ultimo.setSiguiente(nuevaPeli);
            nuevaPeli.setSiguiente(primero);
            ultimo = nuevaPeli;

        }


    }

    public void recorrerLista(){
        actual = primero;
        
        do{
            
            System.out.println("" + actual.getDato());
            actual = actual.getSiguiente();
        }while(actual != primero);
    }
    
    public Nodo<T> buscarPelicula(T peliculaABuscar) {

        actual = primero;

        while (actual != null && !actual.getDato().equals(peliculaABuscar)) {

            actual = actual.getSiguiente();
        }

        return actual;
        
    }
    
    public void editarPelicula(T pelicula, T valor){
        
        actual = primero;
        
        do{
            if(actual.getDato().equals(pelicula)){
                actual.setDato(valor);
            }
            
            actual = actual.getSiguiente();
            
        }while(actual != primero);
        
    }

    public void eliminarPelicula(T peliculaAEliminar){
        
        actual = primero;
        anterior = ultimo;
        
        do{
            if(actual.getDato().equals(peliculaAEliminar)){
                if(actual == primero){
                    
                    primero = primero.getSiguiente();
                    ultimo.setSiguiente(primero);
                    
                } else if(actual == ultimo){
                    
                    anterior.setSiguiente(ultimo.getSiguiente());
                    ultimo = anterior;
                    
                }else{
                    anterior.setSiguiente(actual.getSiguiente());
                }
            }
            
            anterior = actual;
            actual = actual.getSiguiente();
        }while(actual != primero);
        
    }

}
