package Seccion3;

import java.util.Scanner;
/*
 * Programa que pida la usuario 3 enteros.
 * Mostrar por pantalla si todos son positivos,
 * si ninguno lo es,
 * si alguno es positivo y los otros no.
 */
public class ejercicio0304 {

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        int a , b , c ;

        System.out.println("Escribe el primer numero entero: ");
        a = sc.nextInt();
        System.out.println("Escribe el segundo numero entero: ");
        b = sc.nextInt();
        System.out.println("Escribe el tercer numero entero: ");
        c = sc.nextInt();
        
        sc.close();

        if (a > 0 && b > 0 && c > 0){
            System.out.println("Todos los numeros son positivos");
        }else if (a > 0 || b > 0 || c > 0){
            System.out.println("Alguno de los numeros son positivos");
        }else{
            System.out.println("Ningun numero es positivo");
        }

    }
}
