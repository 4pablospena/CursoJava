package Seccion2;

import java.util.Scanner;

/*
 * Programa que pida al usuario : dos numeros enteros
 * los almacene en dos variables enteras
 * y calcular la division real, mostrada por pantalla con dos decimales
 * 
 * En segundo lugar haz lo mismo pero introduciendo dos cadenas de texto
 * y convirtiendolo a numeros.
 * 
 */


public class ejercicio0213 {

    public static void main(String[] args) {
        
    // Primera parte del ejercicio.

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un entero:");
        int entero1 = sc.nextInt();

        System.out.println("Escribe otro entero:");
        int entero2 = sc.nextInt();

        float resultado = (float)entero1 / entero2;
        sc.close();

        System.out.printf("El resultado de la division de %d y %d es %4.2f." , entero1, entero2, resultado);
    
    // Segunda parte del ejercicio.

        int entero3 , entero4;
        String textoEntero3;
        System.out.println("Escribe un entero:");
        textoEntero3 = System.console().readLine();
        entero3 = Integer.parseInt(textoEntero3);

        System.out.println("Escribe otro entero:");
        entero4 = Integer.parseInt(System.console().readLine());

        float resultado2 = (float)entero3 / entero4;

        System.out.printf("El resultado de la division de %d y %d es %4.2f." , entero3, entero4, resultado2);
    }
    
}
