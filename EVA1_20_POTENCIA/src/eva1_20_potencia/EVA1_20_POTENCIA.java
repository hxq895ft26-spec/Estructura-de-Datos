/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_20_potencia;

/**
 *
 * @author 4PF95LA_1909
 */
public class EVA1_20_POTENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("2 elevado a la 3 = " + potencia(2,3));
    }
    
    public static int potencia(int base, int exp){
        if(exp == 1)
            return base; 
        else
            return base * potencia(base, exp - 1); //resuelve el problema, llamada recursiva
            
    }
}
