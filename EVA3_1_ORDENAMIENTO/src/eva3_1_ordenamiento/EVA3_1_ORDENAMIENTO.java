/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_ordenamiento;

/**
 *
 * @author 4PF95LA_1909
 */
public class EVA3_1_ORDENAMIENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] datos = new int[10];
        long ini, fin, tiempo;

        llenar(datos);

        System.out.println("ARREGLO ORIGINAL");
        imprimir(datos);

        // SELECTION SORT
        System.out.println("*****SELECTION SORT*****");

        int[] selection = copiar(datos);

        ini = System.nanoTime();
        selectionSort(selection);
        fin = System.nanoTime();

        tiempo = fin - ini;

        imprimir(selection);

        System.out.println("Tiempo SelectionSort: " + tiempo);

        // INSERTION SORT
        System.out.println("*****INSERTION SORT*****");

        int[] insertion = copiar(datos);

        ini = System.nanoTime();
        insertionSort(insertion);
        fin = System.nanoTime();

        tiempo = fin - ini;

        imprimir(insertion);

        System.out.println("Tiempo InsertionSort: " + tiempo);

        // BUBBLE SORT
        System.out.println("*****BUBBLE SORT*****");

        int[] bubble = copiar(datos);

        ini = System.nanoTime();
        bubbleSort(bubble);
        fin = System.nanoTime();

        tiempo = fin - ini;

        imprimir(bubble);

        System.out.println("Tiempo BubbleSort: " + tiempo);
    }

    public static void llenar(int[] arreglo) {

        // 0 - 99
        for (int i = 0; i < arreglo.length; i++) {

            arreglo[i] = (int) (Math.random() * 100);
        }
    }

    public static void imprimir(int[] arreglo) {

        for (int i = 0; i < arreglo.length; i++) {

            System.out.println("[" + arreglo[i] + "]");
        }

        System.out.println("");
    }

    public static int[] copiar(int[] arreglo) {

        int[] copia = new int[arreglo.length];

        for (int i = 0; i < arreglo.length; i++) {

            copia[i] = arreglo[i];
        }

        return copia;
    }

    // SELECTION SORT
    public static void selectionSort(int[] arreglo) {

        for (int i = 0; i < arreglo.length; i++) {

            int min = i;

            for (int j = i + 1; j < arreglo.length; j++) {

                // buscamos el valor más pequeño
                if (arreglo[j] < arreglo[min]) {

                    min = j;
                }
            }

            // intercambio (swap)
            int temp = arreglo[min];
            arreglo[min] = arreglo[i];
            arreglo[i] = temp;
        }
    }

    // INSERTION SORT
    public static void insertionSort(int[] arreglo) {

        for (int i = 1; i < arreglo.length; i++) {

            int temp = arreglo[i];
            int j = i;

            while (true) {

                if (j > 0 && arreglo[j - 1] > temp) {

                    arreglo[j] = arreglo[j - 1];
                    j--;

                } else {

                    break;
                }
            }

            arreglo[j] = temp;
        }
    }

    // BUBBLE SORT
    public static void bubbleSort(int[] arreglo) {

        for (int i = 0; i < arreglo.length; i++) {

            for (int j = 0; j < arreglo.length - 1; j++) {

                if (arreglo[j] > arreglo[j + 1]) {

                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }
    public static void quickSort(int[] arreglo, int ini, int fin) {
        int pivote = ini;
        quickSort(arreglo, ini, pivote - 1);
        quickSort(arreglo, pivote  + 1, fin
                
                
                
                
                
                
                
                
                
                
        );
    }
}