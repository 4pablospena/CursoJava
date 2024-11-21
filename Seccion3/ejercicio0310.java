package Seccion3;
import java.util.Scanner;

/*
 * Programa que pida numeros enteros en un bucle while.
 * Si se introduce un 0 , se forzara una repecion mas del bucle,
 * Si se introduce un negativo, finaliza el bucle.
 * 
 * Mostrar por pantalla cuantos numeros enteros ha introducido el usuario.
 */

public class ejercicio0310 {
    public static void main(String[] args) {
        
        int dato;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Escribe un numero entero: ");
            dato = sc.nextInt();

            if(dato < 0)
                break;

            if(dato == 0)
                continue;
        }
        while(true);

        sc.close();
    }   
}
