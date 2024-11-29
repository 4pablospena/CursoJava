package Seccion4;
import java.util.Scanner;

/*
 * Programa que recoja las temperatuas macumas , en grados centígrados,
 * de los 3 meses de invierno.
 * Para cada mes el ususaerio decidira cuantas temperaturas va a introducir,
 * y lo introducira en el array.
 * Al finalizar, se debera de mostrat en pantalla la media de las temperaturas 
 * de cada mes. 
 * Utiliza un array de array.
 * 
*/

public class ejercicio0404b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matriz = new int [3][12];
        
        System.out.println("Introduzca las temperaturas de invierno:");
        matriz[0][0] = sc.nextInt();
        matriz[0][1] = sc.nextInt();
        matriz[0][2] = sc.nextInt();
        matriz[0][3] = sc.nextInt();
        matriz[0][4] = sc.nextInt();
        matriz[0][5] = sc.nextInt();
        matriz[0][6] = sc.nextInt();
        matriz[0][7] = sc.nextInt();
        matriz[0][8] = sc.nextInt();
        matriz[0][9] = sc.nextInt();
        matriz[0][10] = sc.nextInt();
        matriz[0][11] = sc.nextInt();
        
        matriz[1][0] = sc.nextInt();
        matriz[1][1] = sc.nextInt();
        matriz[1][2] = sc.nextInt();
        matriz[1][3] = sc.nextInt();
        matriz[1][4] = sc.nextInt();
        matriz[1][5] = sc.nextInt();
        matriz[1][6] = sc.nextInt();
        matriz[1][7] = sc.nextInt();
        matriz[1][8] = sc.nextInt();
        matriz[1][9] = sc.nextInt();
        matriz[1][10] = sc.nextInt();
        matriz[1][11] = sc.nextInt();
        
        matriz[2][0] = sc.nextInt();
        matriz[2][1] = sc.nextInt();
        matriz[2][2] = sc.nextInt();
        matriz[2][3] = sc.nextInt();
        matriz[2][4] = sc.nextInt();
        matriz[2][5] = sc.nextInt();
        matriz[2][6] = sc.nextInt();
        matriz[2][7] = sc.nextInt();
        matriz[2][8] = sc.nextInt();
        matriz[2][9] = sc.nextInt();
        matriz[2][10] = sc.nextInt();
        matriz[2][11] = sc.nextInt();
        
        System.out.println("Matriz de entrada:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.print(matriz[i][j] + " ");
            }   
            System.out.println();
        }
        
        int [] medias = new int [3];
        
        for (int i = 0; i < 3; i++) {
            int media = 0;
            for (int j = 0; j < 12; j++) {
                media += matriz[i][j];
            }
            medias[i] = media / 12;
        }
        
        System.out.println("Medias de cada mes:");
        for (int i = 0; i < 3; i++) {
            System.out.println(medias[i]);
        }       

		sc.close();
    }
}   