/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Sala de Sistemas
 */
public class ArregloNombres {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> espa;
        ArrayList<String> ingles;
        Object opcion;
        espa = new ArrayList<String>();
        ingles = new ArrayList<String>();

        String pe, pi;

        do {
            opcion = JOptionPane.showInputDialog(null, "Seleccione una opción", "Menú de opciones", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Agregar Palabra", "Buscar palabras", "Eliminar palabra", "Imprimir Diccionario", "Salir"}, "Seleccione");
            if (opcion != null) {
                if (opcion.equals("Agregar Palabra")) {

                    pe = JOptionPane.showInputDialog(null, "Digite La palabra en Español : ");

                    pi = JOptionPane.showInputDialog(null, "Digite La palabra en Ingles : ");
                    if (espa.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay palabras", "Error", JOptionPane.ERROR_MESSAGE);

                    }
                } else if (opcion.equals("Buscar palabras")) {
                    System.out.println("Buscar");
                    pe = JOptionPane.showInputDialog("digite la palabra en español a buscar");
                    if (pe.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay palabras", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        for (int i = 0; i < espa.size(); i++) {

                        }

                    }
                } else if (opcion.equals("Eliminar palabras")) {
                    if (espa.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay nombres", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    //System.out.println("Eliminar nombre");
                } else if (opcion.equals("Imprimir palabras")) {
                    if (espa.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay nombres", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Nombres: " + espa);
                    }
                }
            }
            //System.out.println("Imprimir");

        } while (opcion != null && !opcion.equals("Salir"));
    }
}
