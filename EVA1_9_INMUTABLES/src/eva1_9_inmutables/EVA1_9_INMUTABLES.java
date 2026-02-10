/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_inmutables;

/**
 *
 * @author 4PF95LA_1909
 */
public class EVA1_9_INMUTABLES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] datos = new int[5];
        
        for (int i = 0; i < datos.length; i++) {
            datos[i] = (int) (Math.random() * 100);
        }
       
        for (int i = 0; i < datos.length; i++) {
            System.out.println("[" + datos[i] + "]");
            
        }
          System.out.println("");
          System.out.println("---AJUSTAMOS EL ARREGLO A TAMAÑO 3---");
        datos = new int [3];
        
for (int i = 0; i < datos.length; i++) {
            System.out.println("[" + datos[i] + "]");
    }
    
        System.out.println("");
    
}
} 
