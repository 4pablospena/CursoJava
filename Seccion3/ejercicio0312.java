package Seccion3;
import java.util.Scanner;

/*
 * Programa que muestre por pantalla triangulo de asteriscos
 * de la altura que indique el usuario.
 */

public class ejercicio0312 {
    public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Que altura quieres para el triangulo?");
        int altura = sc.nextInt();

        for (int fila = 1; fila <= altura; fila++)
        {
            for (int columna = 1; columna <= fila; columna++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}