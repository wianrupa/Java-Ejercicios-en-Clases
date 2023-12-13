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
public class ExcepcionConJOption {

    public static void main(String[] args) {
        //Scanner entrada = new Scanner(System.in);
        int a, b;
        boolean error = false;
        int arreglo[] = {1, 5, -6, 0};
        int pos;

        do {
            error = false;
            try {
                a = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un valor 1"));
                b = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un valor 2"));
                JOptionPane.showMessageDialog(null, "El cociente de " + a + "/" + b + " es " + (a / b), "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
            } catch (ArithmeticException e) {
                error = true;
                JOptionPane.showMessageDialog(null, "No se puede dividir entre 0", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            } catch (InputMismatchException e) {
                error = true;
                JOptionPane.showMessageDialog(null, "Debes ingresar valores enteros", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            } catch (NumberFormatException e) {
                error = true;
                JOptionPane.showMessageDialog(null, "No se puede convertir String a numero", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            }
        } while (error);

        do {
            error = false;
            try {
                pos = Integer.parseInt(JOptionPane.showInputDialog("Digite una posición para imprimir el valor:"));
                JOptionPane.showMessageDialog(null, "El valor que se encuentra en la posición " + pos + " es: " + arreglo[pos], "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
            } catch (ArrayIndexOutOfBoundsException e) {
                error = true;
                JOptionPane.showMessageDialog(null, "Posición del arreglo no encontrado", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            }
        } while (error);
    }
}
