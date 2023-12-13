/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

import javax.swing.JOptionPane;

/**
 *
 * @author Wilmer Ruiz (Ejercicio práctico en clases )
 */
public class Cadena {
    public static void main(String[] args) {
        String cadena;
char jk = 0;
boolean br = false;
int bre = 0;

// Se solicita los datos al usuario

cadena = JOptionPane.showInputDialog("Digite el nombre ");
if (cadena.isEmpty()); {

}
for (int i = 0; i < cadena.length() - 1; i++) {
for (int j = i + 1; j < cadena.length(); j++) {
if (cadena.charAt(i)== cadena.charAt(j)) {
jk=cadena.charAt(i);
bre++;
br=true;
break;

}

}
}
if (br) {
JOptionPane.showMessageDialog(null, "Se repite ["+bre +"] el caracter " +jk );

} else
JOptionPane.showMessageDialog(null, "Cadena única");

}
}
    
