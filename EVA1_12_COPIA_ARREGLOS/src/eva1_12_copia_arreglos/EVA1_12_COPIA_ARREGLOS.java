/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_copia_arreglos;

/**
 *
 * @author 4PF95LA_1909
 */
public class EVA1_12_COPIA_ARREGLOS {

    public static void main(String[] args) {

        Ejemplo[] arreglo = new Ejemplo[2];
        System.out.println(arreglo);
        //arreglo. --> nos permite acceder al arreglo
        //cramos cada pbjeto en la posiciones del arreglo
        arreglo[0] = new Ejemplo();
        arreglo[1] = new Ejemplo();
        //Imprimimos las direcciones
        System.out.println("arreglo[0]=" + arreglo[0]);
        System.out.println("arreglo[1]=" + arreglo[1]);
        
        
        System.out.println(arreglo[0].val);
        System.out.println(arreglo[1].val);
        
        //Ejemplo[] copia = arreglo; //NO FUNCIONA, CREO UN DUPLICADO DE LA DIRECCIÓN
        Ejemplo[] copia = new Ejemplo[2]; //DEBO CREAR UN NUEVO ARREGLO
        System.out.println("copia=" + copia);
        //posición por posición copiar de un arreglo al otro;
        //ESTO NO SIRVE TAMPOCO
        //copia[0] = arreglo[0]; //no duplico el objeto, duplique la dirección
        //copia[1] = arreglo[1];
        //CREAR UN "BACKUP" DE UN OBJETO IMPLICA "CREAR" O INSTANCIAR OTRO OBJETO
        //QUE SIRVA DE RESPALDO
        copia[0] = new Ejemplo();
        copia[1] = new Ejemplo();
        System.out.println("copia[0]=" + copia[0]);
        System.out.println("copia[1]=" + copia[1]);
        //ahora si, hay que transferir la info de un obketo a otro (siempre y 
        //cuando esa info no sean objetos tmbien
        copia[0].val = arreglo[0].val;
        copia[1].val = arreglo[0].val;
        
        
    }
    
}

class Ejemplo{
    int val = 5;
}

