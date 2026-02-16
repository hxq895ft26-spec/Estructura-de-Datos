/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_califas;

import java.util.Scanner;

/**
 *
 * @author 4PF95LA_1909
 */
public class EVA1_16_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] grupos;//NO SABEMOS CUANTOS GRUPOS SON. LOS INDICA EL USUARIO
        
        System.out.println("¿Cuántos grupos tiene la escuela?");
        int cant = input.nextInt();
        input.nextLine();
        grupos = new int[cant][];
        for (int i = 0; i < grupos.length; i++) {//
            System.out.println("¿Cuántos estudiantes tiene el grupo " + (i + 1) + "?");
            int estudiantes = input.nextInt();
            input.nextLine();
            grupos[i] = new int[estudiantes];
        }
        
        for (int i = 0; i < grupos.length; i++) {
            System.out.println("++++++++GRUPO " + (i + 1) + "+++++++++");
        for (int j = 0; i < grupos.length; j++) {
            System.out.println("Calificacion del estudiante  " + (j + 1) + ":");
            int califa = input.nextInt();   
            grupos[i][j] = califa;
            input.nextLine();
        }
    }
        // Mostrar calificaciones y promedio por grupo
        for (int i = 0; i < grupos.length; i++) {
            System.out.println("+++++++ RESULTADOS GRUPO " + (i + 1) + " +++++++");
            int suma = 0;

            for (int j = 0; j < grupos[i].length; j++) {
                System.out.println("Estudiante " + (j + 1) + ": " + grupos[i][j]);
                suma += grupos[i][j];
            }

            double promedio = (double) suma / grupos[i].length;
            System.out.println("Promedio del grupo " + (i + 1) + ": " + promedio);
        }

    }   
}
