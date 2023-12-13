
package excepciones;

/**
 *
 * @author yeneris.blanco
 */
public class SinExcepcionDivision {
    
    public static void main(String[] args) {
        int numerador = 10;
        int denominador = 0;
        float division;
        
        System.out.println("Antes de hacer la división");   
        division = numerador /denominador;
        ////Si se digita una valor por fuera del rango de posiciones sale una java.lang.ArithmeticException
        System.out.println("Después de hacer la división");   
    }
}
