package Seccion4;
import java.util.Scanner;
/*
 * Programa que pida un numero entero al usuario.
 * Despues debera de crear un array de ese tamaño 
 * y pedir que rellene cada casilla.
 * 
 * Finalmene recorrera el array y mostrara por pantalla
 * los multiples de 3 del array.
 * 
 */

public class ejercicio0401{
    public static void main (String arg []){

        Scanner sc = new Scanner (System.in);
        int cantidad;
        int[] datos;

        System.out.println("Escribe un entero que será el tamaño del array: ");
        cantidad = sc.nextInt();
        datos = new int[cantidad];

        for( int i = 0 ; i < cantidad ; i++){
            System.out.println("Dime el dato " + (i+1) + ": ");
            datos[i] = sc.nextInt();
        }

        System.out.print("Los numeros que son multiplos de 3 son: ");
        for ( int dato : datos){
            if(dato % 3 == 0){
                System.out.print(dato + ", ");
            }else{
                System.out.println ("no he encontrado multiplos de 3");
            }
        }
        sc.close();
    }
}