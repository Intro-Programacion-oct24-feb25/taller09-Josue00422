/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] Ventas = new double[5];
        String[] Dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};

        for (int i = 0; i < Dias.length; i++) {
            System.out.printf("Ingresar el valor de ventas del dia %s\n",
                    Dias[i]);

            double venta = entrada.nextDouble();
            Ventas[i] = venta;

        }
        for (int i = 0; i < Dias.length; i++) {
            System.out.printf("· %s $%.0f\n", Dias[i], Ventas[i]);
        }

    }
}
