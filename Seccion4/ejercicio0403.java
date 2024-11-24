package Seccion4;
import java.util.Scanner;

/*
 * Crea un array sobredimensionado para almacenar hasta 10 enteros.
 * Pide al ususario que añada 5, uno tras otro.
 * Luego que elija una posicion a borrar.
 * Si es la posicion la borra, sino mensaje de que no puede borrar.
 * 
 * Finalmente muestra por pantalla el estado del array.
 */

public class ejercicio0403{

    public static void main (String [] args){


        Scanner sc = new Scanner (System.in);
        final int TAMANO = 10;
        int cantidad = 0;
        int [] numeros = new int[TAMANO];
        int posicionBorrado;

        for (int i = 0 ; i < 5 ; i ++){
            System.out.println("Dime el dato " + (i+1) + ": ");
            numeros [cantidad] = sc.nextInt();
            cantidad++;
        }
      
        System.out.println("¿Que posicion quieres borrar?");
        posicionBorrado = sc.nextInt() - 1;
        if (( posicionBorrado < 0 ) || (posicionBorrado >= cantidad)){
            System.out.println("posicion no valida");
        }else{
        for( int i = posicionBorrado; i < cantidad ; i++){
            numeros [i] = numeros [i+1];
        }
        cantidad--;
        }

        System.out.println("El array es: ");
        for (int i = 0 ; i < cantidad; i ++){
            System.out.println(numeros [i]);
        }

        sc.close();
    }
}