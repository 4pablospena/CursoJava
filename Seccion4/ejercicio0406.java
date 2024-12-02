package Seccion4;
import java.util.Scanner;

/*
 * Progrmaa que puda al ususario que escriba en una linea una serie de nombres
 * separados por comas, despues mostrara por pantalla cuantos nombres ha escrito
 * y los mostrara en mayusculas en lineas separadas.
 * 
 */

public class ejercicio0406 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String nombres;
        int numeroNombres;
        
        System.out.println("Escribe los nombres separados por comas: ");
        nombres = sc.nextLine();
        numeroNombres = nombres.split(",").length;
        
        System.out.println("Escribió " + numeroNombres + " nombres");
        System.out.println("Los nombres son: ");
        for (int i = 0; i < numeroNombres; i++) {
            System.out.println(nombres.split(",")[i].toUpperCase());
        }               
        
        sc.close();
    }
}


