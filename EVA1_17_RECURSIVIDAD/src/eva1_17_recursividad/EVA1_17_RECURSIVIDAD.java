/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_recursividad;

/**
 *
 * @author burci
 */
public class EVA1_17_RECURSIVIDAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EVA1_17_RECURSIVIDAD obj = new EVA1_17_RECURSIVIDAD();
        obj.imprimirLista(5);
        System.out.println("");
        imprimirListaRec(5);
        System.out.println("");
        imprimirListaUp(5);
    }

    public void imprimirLista(int val) {
        for (int i = val; i > 0; i--)
            System.out.println(i + " - "); 
    }

    public static void imprimirListaUp(int val) {
        //SELECCIÓN QUE RESUELVE EL PROBLEMA
        for (int i = val; i > 0; i--) {
        }
    }

    public static void imprimirListaRec(int val) {
        System.out.println(val + " - ");
        if (val > 1)//DETENER LA RECURSIVIDAD
            imprimirListaRec(val - 1);
    }

    public static void imprimirListaRecUp(int val) {
                System.out.println(val + " - ");
        if (val > 1)//DETENER LA RECURSIVIDAD
            imprimirListaRec(val + 1);

    }
}