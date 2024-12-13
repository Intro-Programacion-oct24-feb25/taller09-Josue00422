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
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
      entrada.useLocale(Locale.US);
      String[] arreglo = {"cafe tradicional", "cafe frances", "cafe aleman"};
      double[] arreglo2 = {1.5, 2.1, 2.3};
      
      int indice;
      int tazas;
      double cancelar;
      double total = 0;
      boolean bandera = true;
      String cadena = "";
      String letra;
      while (bandera){
          System.out.println("Ingrese el cafe que desee: tradicional(0), "
                  + "frances(1), aleman(2)");
          indice = entrada.nextInt();
          System.out.println("Ingrese el numero de tazas");
          tazas = entrada.nextInt();
          entrada.nextLine();
          
          cancelar = arreglo2[indice] * tazas;
          total = total + cancelar;
          cadena = String.format("%s%s (%d) valor a cancelar: $%.2f ",cadena,
                  arreglo[indice],
                  tazas,
                  cancelar);
          System.out.println("Si desea terminar digite (si)");
          letra = entrada.nextLine();
          if(letra.equals("si")){
           bandera = false;
          }
          
      
      
      }
      cadena = String.format("%s Total a pagar: $%.2f", cadena, total);
      System.out.printf("El usuario ha comprado:\n%s\n",  cadena);

        
      

    }

}
