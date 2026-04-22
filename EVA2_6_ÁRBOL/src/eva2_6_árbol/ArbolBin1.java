/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_6_árbol;

public class ArbolBin1 {
    private Nodo raiz;

    public ArbolBin1() {
        raiz = null;
    }

    public void agregar(int valor) {
        if (raiz == null) {
            raiz = new Nodo(valor);
        } else {
            agregarRecu(raiz, valor);
        }
    }

    private void agregarRecu(Nodo actual, int valor) {
        if (valor < actual.getValor()) {
            if (actual.getIzquierda() == null) {
                actual.setIzquierda(new Nodo(valor));
            } else {
                agregarRecu(actual.getIzquierda(), valor);
            }
        } else {
            if (actual.getDerecha() == null) {
                actual.setDerecha(new Nodo(valor));
            } else {
                agregarRecu(actual.getDerecha(), valor);
            }
        }
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void imprimirPreOrderRec() {
        preOrderRec(raiz);
        System.out.println();
    }

    private void preOrderRec(Nodo actual) {
        if (actual != null) {
            System.out.print(actual.getValor() + " ");
            preOrderRec(actual.getIzquierda());
            preOrderRec(actual.getDerecha());
        }
    }

    public void imprimirPreOrder() {
        if (raiz == null) return;

        java.util.Stack<Nodo> pila = new java.util.Stack<>();
        pila.push(raiz);

        while (!pila.isEmpty()) {
            Nodo actual = pila.pop();
            System.out.print(actual.getValor() + " ");

            if (actual.getDerecha() != null) {
                pila.push(actual.getDerecha());
            }

            if (actual.getIzquierda() != null) {
                pila.push(actual.getIzquierda());
            }
        }

        System.out.println();
    }
}