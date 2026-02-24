/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_21_sumatoria;

/**
 *
 * @author 4PF95LA_1909
 */
public class EVA1_21_SUMATORIA {

    public static void main(String[] args) {
        System.out.println("Sumatoria hasta 5 = " + sumatoria(5));
    }

    public static int sumatoria(int n){
        if(n == 1)
            return 1;
        else
            return n + sumatoria(n - 1); // llamada recursiva
    }
}
