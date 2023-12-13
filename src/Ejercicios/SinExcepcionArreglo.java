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
public class SinExcepcionArreglo {
     public static void main(String[] args) {
        int arreglo[] = {1,5,-6,0};
        int pos;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Digite una posición para imprimir el valor: ");
        pos = leer.nextInt();
        //Si se digita una valor por fuera del rango de posiciones sale una java.lang.ArrayIndexOutOfBoundsException
        System.out.println("El valor que se encuentra en la posición " + pos + " es: "+arreglo[pos]  );   
        
       
    }
}
