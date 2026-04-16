/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_4_stack;

public class Pila {
    private Nodo inicio;
    private Nodo fin;
    private int contador;

    public Pila() {
        this.inicio = null;
        this.fin = null;
        this.contador = 0;
    }

    public boolean esVacia() {
        return inicio == null;
    }

    public int longitud() {
        return contador;
    }

    public void push(int valor) {
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

    public int pop() {
        if (fin == null) {
            throw new RuntimeException("Pila vacía");
        }

        int valor = fin.getValor();

        if (inicio == fin) { // solo 1 elemento
            inicio = null;
            fin = null;
        } else {
            fin = fin.getPrevio();
            fin.setSiguiente(null);
        }

        contador--;
        return valor;
    }

    public int peek() {
        if (fin == null) {
            throw new RuntimeException("Pila vacía");
        }
        return fin.getValor();
    }

    // Imprimir normal
    public void imprimirLista() {
        Nodo temp = inicio;

        if (temp == null) {
            System.out.println("Pila vacía");
            return;
        }

        while (temp != null) {
            System.out.print(temp.getValor() + " -> ");
            temp = temp.getSiguiente();
        }

        System.out.println("null");
    }

    // Imprimir al revés
    public void imprimirListaInv() {
        Nodo temp = fin;

        if (temp == null) {
            System.out.println("Pila vacía");
            return;
        }

        while (temp != null) {
            System.out.print(temp.getValor() + " -> ");
            temp = temp.getPrevio();
        }

        System.out.println("null");
    }
}