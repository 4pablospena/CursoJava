package Seccion3;
import java.util.Scanner;
/*
 * Programa que pida al usuario 10 numeros enteros.
 * Calcule y muestre por pantalla la media aritmetica redondeada a 1 decimal
 */
public class ejercicio0309 {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        double suma = 0;

        for ( int contador = 1 ; contador <= 10 ; contador++){
            System.out.println("Escribe un numero entero: ");
            int entero = sc.nextInt();
            suma += entero;
           
        }
        System.out.printf("La media de todos los datos es %4.1f" , suma / 10.0);
        
        sc.close();
    }
    
}
