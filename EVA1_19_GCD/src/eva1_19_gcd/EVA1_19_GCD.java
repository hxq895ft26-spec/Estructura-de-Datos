/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_gcd;

/**
 *
 * @author 4PF95LA_1909
 */
public class EVA1_19_GCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Maximo común divisor de 180 y 48 es " + gcd(180,48));
    }
    public static int gcd(int val1, int val2){
        while(val2 != 0){
        int residuo = val1 % val2;
        val1 = val2;
        val2 = residuo;
        }
        return val1;
    }
    
}
