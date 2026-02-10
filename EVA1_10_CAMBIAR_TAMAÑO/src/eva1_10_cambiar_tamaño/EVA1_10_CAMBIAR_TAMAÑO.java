/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_cambiar_tamaño;

/**
 *
 * @author 4PF95LA_1909
 */
public class EVA1_10_CAMBIAR_TAMAÑO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] datos5 = new int[5];
        int[] datos3 = new int[3];
        
        for (int i = 0; i < datos5.length; i++) {
            datos5[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < datos3.length; i++) {
            datos3[i] = datos5[i];
        }
        for (int i = 0; i < datos5.length; i++) {
            System.out.println("[" + datos5[i] + "]");
        }
        
        System.out.println("--Nuevos valores de datos--");
        
        
        for (int i = 0; i < datos3.length; i++) {
            System.out.println("[" + datos3[i] + "]");
            //RESPALDAR LA INFO EN UN NUVEO ARREGLO
        }
    }
}
        
    

