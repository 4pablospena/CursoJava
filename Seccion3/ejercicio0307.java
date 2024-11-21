package Seccion3;
import java.util.Scanner;

/*
 * Programa pide al usuario numero enteros positivos
 * Cuando el usuario introduzca un numero negativo
 * muestra por pantalla la suma de todos los entero 
 * positivos introducidos.
 */
public class ejercicio0307 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe un numero entero positivo: ");
        int numero = sc.nextInt();
        int suma = 0; //inciailizado a 0

        while(numero >= 0){
            suma += numero;
            System.out.println("Escribe otro numero entero positivo: ");
            numero = sc.nextInt();
        }
        System.out.println("La suma es : " + suma);

        sc.close();
    }
}
