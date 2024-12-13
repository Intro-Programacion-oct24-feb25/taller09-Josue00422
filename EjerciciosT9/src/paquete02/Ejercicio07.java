/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int[] arreglo = new int[10];
        String cadena = "";
        double suma = 0;
        double promedio;
        double diferencia = 0;
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese un numero");
            arreglo[i] = entrada.nextInt();
            suma = suma + arreglo[i];

        }
        promedio = suma / arreglo.length;
        for (int i = 0; i < arreglo.length; i++) {
            diferencia = (promedio - arreglo[i]);
            cadena = String.format("%s%d con diferencia de: %.2f\n", cadena,
                    arreglo[i],
                    diferencia);

        }
        System.out.printf("%s", cadena);

      

    }

}
