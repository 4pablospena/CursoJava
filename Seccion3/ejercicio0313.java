package Seccion3;
import java.util.Scanner;

/*
 * Programa que pida 10 numeros positivos enteros.
 * verificando que cada numero sea positivo en cada paso.
 * De lo contrario se pedira que lo introduzca tantas veces como
 * sea necesario.
 * finalmente muestra el resultado de la suma.
 */

public class ejercicio0313 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int n;
        int suma = 0;

        for( int i = 1; i <= 10 ; i++){
            do{
                System.out.println("Dime un entero positivo");
                n = sc.nextInt();
            }
            while (n <= 0);
            
            suma += n;
        }
        System.out.println("Su suma es " + suma);
         
        sc.close();
    }
    
}
