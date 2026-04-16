/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_3_lista_doble;

public class ListaDoble {
    private Nodo inicio;
    private Nodo fin;
    private int contador;

    public ListaDoble() {
        this.inicio = null;
        this.fin = null;
        this.contador = 0;
    }

    public void imprimirLista() {
        Nodo temp = inicio;

        if (temp == null) {
            System.out.println("Lista vacía");
            return;
        }

        while (temp != null) {
            System.out.print(temp.getValor() + " -> ");
            temp = temp.getSiguiente();
        }

        System.out.println("null");
    }

    public void imprimirListaInv() {
        if (fin == null) {
            System.out.println("Lista vacía");
            return;
        }

        Nodo temp = fin;

        while (temp != null) {
            System.out.print(temp.getValor() + " -> ");
            temp = temp.getPrevio();
        }

        System.out.println("null");
    }

    public int longitud() {
        return contador;
    }

    public void vaciarLista() {
        inicio = null;
        fin = null;
        contador = 0;
    }

    public boolean esVacia() {
        return inicio == null;
    }

    public void agregar(int valor) {
        Nodo nuevo = new Nodo(valor);

        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            nuevo.setPrevio(fin);
            fin = nuevo;
        }

        contador++;
    }

    public void agregarEn(int valor, int posicion) {
        Nodo nuevo = new Nodo(valor);

        if (posicion == 0) {
            nuevo.setSiguiente(inicio);

            if (inicio != null) {
                inicio.setPrevio(nuevo);
            }

            inicio = nuevo;

            if (fin == null) {
                fin = nuevo;
            }

            contador++;
            return;
        }

        if (posicion >= contador) {
            agregar(valor);
            return;
        }

        Nodo temp = inicio;
        int i = 0;

        while (i < posicion) {
            temp = temp.getSiguiente();
            i++;
        }

        nuevo.setSiguiente(temp);
        nuevo.setPrevio(temp.getPrevio());

        temp.getPrevio().setSiguiente(nuevo);
        temp.setPrevio(nuevo);

        contador++;
    }

    public void eliminar() {
        if (inicio == null) {
            System.out.println("Lista vacía");
            return;
        }

        if (inicio == fin) {
            inicio = null;
            fin = null;
        } else {
            inicio = inicio.getSiguiente();
            inicio.setPrevio(null);
        }

        contador--;
    }

    
    public void eliminarUltimo() {
        if (fin == null) {
            System.out.println("Lista vacía");
            return;
        }

        if (inicio == fin) {
            inicio = null;
            fin = null;
        } else {
            fin = fin.getPrevio();
            fin.setSiguiente(null);
        }

        contador--;
    }

    // 🔴 ELIMINAR EN POSICIÓN
    public void eliminarEn(int posicion) {
        if (inicio == null) {
            System.out.println("Lista vacía");
            return;
        }

        if (posicion < 0 || posicion >= contador) {
            throw new RuntimeException("Posición inválida");
        }

        if (posicion == 0) {
            eliminar();
            return;
        }

        if (posicion == contador - 1) {
            eliminarUltimo();
            return;
        }

        Nodo temp = inicio;
        int i = 0;

        while (i < posicion) {
            temp = temp.getSiguiente();
            i++;
        }

        temp.getPrevio().setSiguiente(temp.getSiguiente());
        temp.getSiguiente().setPrevio(temp.getPrevio());

        contador--;
    }

    // 🔴 BUSCAR VALOR
    public int buscar(int valor) {
        Nodo temp = inicio;
        int pos = 0;

        while (temp != null) {
            if (temp.getValor() == valor) {
                return pos;
            }
            temp = temp.getSiguiente();
            pos++;
        }

        return -1;
    }
}