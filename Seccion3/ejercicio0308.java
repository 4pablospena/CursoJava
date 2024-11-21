package Seccion3;
import java.util.Scanner;

/*
 * Programa que pida al usuario numeros enteros
 * mientras sean positivos y maximo 5,
 * Finaliza con entrada de numer negativo o los 5 positivos
 * muestra por pantalla la suma de todos los positivos.
 */

public class ejercicio0308 {
    public static void main(String args[]){


        int n; 
        int suma = 0;
        int contador = 0;

        Scanner sc = new Scanner (System.in);

        do{
            System.out.println("Escribe un numero entero: ");
            n = sc.nextInt();
            contador ++;
                if (n >= 0){
                    suma += n;
                }
        }while  ((n>=0) && (contador <= 5));

        System.out.println("la suma de los numeros enteros es: " + suma);
    
        sc.close();
    }
}
