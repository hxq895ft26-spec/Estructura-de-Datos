/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_tipos_genericos;

public class EVA2_8_TIPOS_GENERICOS {

    public static void main(String[] args) {
        int x = 100;
        Integer val = x;

        Prueba<Integer> prueba = new Prueba<Integer>(100);
        prueba.setDato(val);
    }
}

class Prueba<T>{
    private T dato;

    public Prueba(T dato) {
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }
}