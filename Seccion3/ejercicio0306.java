package Seccion3;
import java.util.Scanner;
/*
 * Programa que pida al usuario escribir un numero entero y, 
 * con el operdor ternario muestre por pantalla si es multiplo de 3.
 */
public class ejercicio0306 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un numero entero: ");
        int entero = sc.nextInt();

        String resultado = (entero % 3 ==0) ? "es múltiplo de 3." : "no es múltiplo de 3.";
        System.out.println("El número "+ entero + " " + resultado);

        sc.close();

    }
    
}
