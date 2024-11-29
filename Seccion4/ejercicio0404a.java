package Seccion4;
import java.util.Scanner;

/*
 *  Programa que defina un array bidimensional de enteros.
 * de 3 filas y 4 columnas.
 * y le pida al usuado que rellen sus datos.
 * Indicar cual es el numero mayor de cada fila.
 */

public class ejercicio0404a {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int [][] matriz = new int [3][4];
        
        System.out.println("Introduzca los datos de la primera fila:");
        matriz[0][0] = sc.nextInt();
        matriz[0][1] = sc.nextInt();
        matriz[0][2] = sc.nextInt();
        matriz[0][3] = sc.nextInt();
        
        System.out.println("Introduzca los datos de la segunda fila:"); 
        matriz[1][0] = sc.nextInt();
        matriz[1][1] = sc.nextInt();
        matriz[1][2] = sc.nextInt();
        matriz[1][3] = sc.nextInt();
        
        System.out.println("Introduzca los datos de la tercera fila:"); 
        matriz[2][0] = sc.nextInt();
        matriz[2][1] = sc.nextInt();
        matriz[2][2] = sc.nextInt();
        matriz[2][3] = sc.nextInt();
        

        System.out.println("Matriz de entrada:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }   
            System.out.println();
        }
        
        int [] filaMayor = new int [3];
        
        System.out.println("Numero mayor de cada fila:");
        for (int i = 0; i < 3; i++) {
            int mayor = matriz[i][0];
            for (int j = 1; j < 4; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
            }
            filaMayor[i] = mayor;
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.println(filaMayor[i]);
        }       

		sc.close();
}}


