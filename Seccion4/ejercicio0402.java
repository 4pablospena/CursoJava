package Seccion4;
import java.util.Scanner;
/*
 * Pide 10 numeros enteros al usuario
 * mostrar por pantalla el valor minimo, maximo y la media.
 */

public class ejercicio0402{
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int [] datos = new int[10];
        int maximo , minimo , suma = 0;

        for (int i = 0 ; i < 10 ; i++){
            System.out.println("Dame el dato " + (i+1) + ": ");
            datos[i] = sc.nextInt();
        }

        // Suma de los numeros.
        for (int i = 0 ; i < 10 ; i++){
            suma += datos[i];
        }

        // Cálculo del maximo y minimo.
        maximo = minimo = datos[0];
        for (int i = 0 ; i < 10 ; i++){
            if (datos [i] > maximo){
                maximo = datos[i];
            }
            if (datos [i] < minimo){
                minimo = datos[i];
        }
    }

        System.out.println (" El máximo es : " + maximo);
        System.out.println (" El mínimo es : " + minimo);
        System.out.println (" la media de los numeros es: " + (suma/10.0));

        sc.close();
    }
}