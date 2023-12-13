/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author yeneris.blanco
 */
public class ManejoTodasExcepciones {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b;
        int arreglo[] = {1, 5, -6, 0};
        int pos;
        String valor;
        int valor1;

        try {
            System.out.print("Ingresa un valor a: ");
            a = entrada.nextInt();

            System.out.print("Ingresa otro valor b: ");
            b = entrada.nextInt();
            System.out.println("El cociente " + a + "/" + b + " es " + (a / b));
            //-------------------------------------------------------------/

            System.out.println("Digite una posición para imprimir el valor: ");
            pos = entrada.nextInt();
            System.out.println("El valor que se encuentra en la posición " + pos + " es: " + arreglo[pos]);
            //-------------------------------------------------------------/
            
            System.out.println("Digite valor para convertir: ");
            valor = entrada.next();
            valor1 = Integer.parseInt(valor);
            System.out.println("El valor convertido a entero:  " + valor1);

        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre 0");
        } catch (InputMismatchException e) {
            System.out.println("Debes ingresar valores enteros");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posición del arreglo no encontrado");
        } catch (NumberFormatException e) {
            System.out.println("No se puede convertir String a numero");
        }
    }
}
