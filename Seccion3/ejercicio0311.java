package Seccion3;
import java.util.Scanner;
/*
 * Programa que pida un numero y determine si es primo o no.
 * Elige la estructura repetitiva mas adecuada.
 */
public class ejercicio0311 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int divisores = 0;

        System.out.println("Escribe un numero: ");
        int entero = sc.nextInt();

        for(int i = 1 ; i <= entero ; i++){
            if(entero % i == 0){
                divisores++;
            }  
        }

        if (divisores == 2){
            System.out.println("Es un numero primo.");
        }else{
            System.out.println("No es un numero primo.");
        }
        sc.close();
    }   
}
