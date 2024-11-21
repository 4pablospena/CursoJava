package Seccion2;

/*
 * Almacena variable de tipo real : pi 3.1416
 * Almacena otra variable (Real o entera) del radio de una circunferencia.
 * Finalmente almacena la longitud de la circunferencia en variable real.
 * Muestra el resultado por pantalla con dos decimales. 
 */

public class ejercicio0211 {
    public static void main(String[] args) {
        float pi = 3.1416f;
        int radio = 5;
        float longitudCircunferencia = 2 * pi * radio;

        System.out.printf("la longitud de la circunferencia de radio %d es %5.2f", 
                         radio, longitudCircunferencia);
    }
    
}
