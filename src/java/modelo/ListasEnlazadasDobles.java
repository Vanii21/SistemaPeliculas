package modelo;

public class ListasEnlazadasDobles<T> {

    public Nodo<T> primero;
    public Nodo<T> ultimo;
    public Nodo<T> actual;
    public Nodo<T> anterior;

    public ListasEnlazadasDobles() {

        primero = null;
        ultimo = null;
        actual = null;
        anterior = null;

    }

    public void ingresarPelicula(T pelicula) {

        Nodo<T> nuevo = new Nodo<T>(pelicula);

        nuevo.setDato(pelicula);

        if (primero == null) {
            primero = nuevo;
            primero.setSiguiente(null);
            primero.setAnterior(null);
            ultimo = primero;
        } else {

            ultimo.setSiguiente(nuevo);
            nuevo.setAnterior(ultimo);
            nuevo.setSiguiente(null);
            ultimo = nuevo;

        }

    }

    public void recorrerListaDoble() {

        actual = ultimo;

        while (actual != null) {

            System.out.println("" + actual.getDato());
            actual = actual.getAnterior();
        }
    }

    public Nodo<T> buscarPeliculaP(T peliculaABuscar) {

        actual = ultimo;

        while (actual != null && !actual.getDato().equals(peliculaABuscar)) {

            actual = actual.getAnterior();
        }

        return actual;

    }

    public void modificarPeliculaP(T pelicula, T valor) {

        actual = ultimo;

        while (actual != null) {
            if (actual.getDato().equals(pelicula)) {
                actual.setDato(valor);
            }
            actual = actual.getAnterior();
        }

    }

    public void eliminaPeliculaP(T peliculaAEliminar) {

        Nodo<T> temp = null;
        Nodo<T> aux = null;

        if (primero != null) {
            if (primero.getDato().equals(peliculaAEliminar)) {
                temp = primero;
                primero = temp.getSiguiente();
                if (primero == null) {
                    ultimo = null;
                } else {
                    primero.setAnterior(null);
                }
            } else if (ultimo.getDato().equals(peliculaAEliminar)) {
                temp = ultimo;
                ultimo = temp.getAnterior();
                ultimo.setSiguiente(null);
            } else {
                aux = primero;
                temp = primero.getSiguiente();

                while (temp != null) {

                    if (temp.getDato().equals(peliculaAEliminar)) {
                        aux.setSiguiente(temp.getSiguiente());
                        temp.getSiguiente().setAnterior(aux);
                        break;
                    }
                    aux = temp;
                    temp = temp.getSiguiente();
                }
            }
        }

    }

}
