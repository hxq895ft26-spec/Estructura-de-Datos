/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_cubo;

/**
 *
 * @author 4PF95LA_1909
 */
public class EVA1_14_CUBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][][] cubo = new int[3][5][2];
        for (int i = 0; i < cubo.length; i++) {//PRIMER DIMENSIÓN
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo[i][j].length; k++) {
                    cubo [i][j][k] = (int) (Math.random() * 100);
                    
                }
                
            }
        }
 
    }
    
}
