/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_8_arreglos;

/**
 *
 * @author 4PF95LA_1909
 */
public class EVA1_8_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] datos = new int[1000000000];
        
        for (int i = 0; i < datos.length; i++) {
            datos[i] = (int) (Math.random() * 100);
            }
        /*for (int i = 0; i < datos.length; i++) {
            System.out.println("[" + datos[i] + "]");
            }
        System.out.println("");*/
    }
    
}
