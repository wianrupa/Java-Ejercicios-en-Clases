/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.util.Scanner;

/**
 *
 * @author yeneris.blanco
 */
public class SinExceptionConversionNumero {
      public static void main(String[] args) {
        String valor;
        int valor1;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Digite algo: ");
        valor = leer.next();
        System.out.println("El valor ingresado es:  " + valor  );   
        
        valor1 = Integer.parseInt(valor);
        System.out.println("El valor convertido a entero:  " + valor1  );   
        
        
    }
}
