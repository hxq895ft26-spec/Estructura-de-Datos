/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_arreglos_multi;

/**
 *
 * @author 4PF95LA_1909
 */
public class EVA1_15_ARREGLOS_MULTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[3][];
        
        //tenemos tres filas (no he específicado cuantas columnas)
        matriz[0] = new int[5]; //estoy creando, dentro de matriz[0] un arreglo de 5 enteros
        matriz[1] = new int[2];
        matriz[2] = new int[4];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("[" + matriz[i][j] + "]");
            }
            System.out.println("");
       
        }
        
    }
}
