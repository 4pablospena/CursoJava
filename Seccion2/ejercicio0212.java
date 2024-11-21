package Seccion2;

/*
 * Programa que pida al usuario su nombre completo, su edad y su altura.
 * almacenados en sus tipos de variables apropiados y 
 * muestre por pantalla el resultado en una sola linea.
 */
import java.util.Scanner;

public class ejercicio0212 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;
        float altura;

        System.out.println("¿Cual es tu nombre?");
        nombre = sc.nextLine();
        System.out.println("¿Cual es tu edad?");
        edad = sc.nextInt();
        System.out.println("¿Cuanto mides?");
        altura = sc.nextFloat();
        sc.close();

        System.out.printf("Te llamas %s , tienes %d años y mides %3.2f metros",
                                 nombre , edad , altura);
        
    }    
}
