/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_referencias;

/**
 *
 * @author 4PF95LA_1909
 */
public class EVA1_5_REFERENCIAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 100;
        Prueba prueba = new Prueba();//CHECANDO UNA INSTANCIA DE PRUEBA
        System.out.println(x);
        System.out.println(prueba);
        //En java, una variable que guarda una direccion (memoria) se llama REFERENCIA.
        //En otros lenguajes --> apuntadores
        //COMO DESTRUYO EL OBJETO:
        prueba = null;//esto solo desconecta la variable del objeto
    
    }
    
}

class Prueba{ 
    int y = 200;
}
