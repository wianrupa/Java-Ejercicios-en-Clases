/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author yeneris.blanco
 */
public class ExcepcionesConException {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b;
        int arreglo[] = {1, 5, -6, 0};
        int pos;

        try {
            System.out.print("Ingresa un valor: ");
            a = entrada.nextInt();

            System.out.print("Ingresa otro valor: ");
            b = entrada.nextInt();

            System.out.println("El cociente " + a + "/" + b + " es " + (a / b));

            System.out.println("Digite una posición para imprimir el valor: ");
            pos = entrada.nextInt();
            System.out.println("El valor que se encuentra en la posición " + pos + " es: " + arreglo[pos]);
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

    }

}
