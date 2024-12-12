/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        double suma = 0;
        String arriba = "";
        String abajo = "";

        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];

        }
        double media = suma / arreglo.length;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] < media) {
                arriba = String.format("%s %d ",arriba,arreglo[i]);

            } else {
                abajo = String.format("%s %d ",abajo,arreglo[i]);
            }
        }
        System.out.printf("La media aritmetica es: %.2f\nLos elementos por "
                + "arriba son: %s\nLos elementos por debajo son: %s\n", media,
                arriba,
                abajo);
    }

}
