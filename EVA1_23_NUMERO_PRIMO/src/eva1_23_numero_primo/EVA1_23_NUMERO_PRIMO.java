/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_23_numero_primo;

/**
 *
 * @author 4PF95LA_1909
 */
public class EVA1_23_NUMERO_PRIMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("El número 537 es primo? " + esPrimoNoEficiente(537));
        System.out.println("El número 537 es primo? " + esPrimoEficiente(537));
    }
    public static boolean esPrimoNoEficiente(int numero){
        boolean esPrimo = true;
        for (int i = 2; i < numero; i++)  {
            if((numero % i) == 0){
                esPrimo = false;
                break;
            }
        }
        return esPrimo;
    }
    public static boolean esPrimoEficiente(int numero){
        boolean esPrimo = true;
        int limite = (int)Math.sqrt(numero);
        for (int i = 2; i <= limite; i++)  {
            if((numero % i) == 0){
                esPrimo = false;
                break;
            }
        }
        return esPrimo;
    
        
        
    }
}
