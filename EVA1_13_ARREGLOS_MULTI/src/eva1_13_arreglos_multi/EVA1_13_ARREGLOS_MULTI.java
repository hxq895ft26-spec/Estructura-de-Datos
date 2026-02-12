/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_arreglos_multi;

/**
 *
 * @author 4PF95LA_1909
 */
public class EVA1_13_ARREGLOS_MULTI {
    final static int FILAS = 5;
    final static int COL = 3;
    

    public static void main(String[] args) {
        int[][] arreglo = new int[FILAS][COL];// 5 FILAS X 3 COLUMNAS = 15 ENTEROS
        //ACCESO POR ÍNDICES
        //PRIMER POSICIÓN:
        arreglo[0][0] = 100;
        //INTERMEDIA:
        arreglo[3][1] = 500;
         //ULTIMA POSICIÓN:
        arreglo[4][2] = 1600;
        
        //DOS DIMENSIONES --> DOS CICLOS PARA PODER RECORRER EL ARREGLO
        for (int i = 0; i < FILAS; i++) {//PRIMER DIMENSIÓN --> FILAS
            for (int j = 0; j < COL; j++) {//SEGUNDA DIMENSIÓN --> COLUMNAS
                arreglo[i][j] = (int)(Math.random() * 100);
            }            
        }
                //DOS DIMENSIONES --> DOS CICLOS PARA PODER RECORRER EL ARREGLO
        for (int i = 0; i < FILAS; i++) {//PRIMER DIMENSIÓN --> FILAS
            for (int j = 0; j < COL; j++) {//SEGUNDA DIMENSIÓN --> COLUMNAS
                System.out.println("[" + arreglo[i][j] + "]");
                 
            }
            System.out.println("");
        }
        System.out.println("arreglo:" + arreglo);
        System.out.println("arreglo[0]:" + arreglo[0]);
        System.out.println("arreglo[1]:" + arreglo[1]);  
        System.out.println("arreglo[2]:" + arreglo[2]);  
        System.out.println("arreglo[3]:" + arreglo[3]);  
        System.out.println("arreglo[4]:" + arreglo[4]);  
        
        
        
 
    
    }
}