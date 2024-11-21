package Seccion2;

/*Escribe un programa que almacene dos variables
 * una con el año de nacimiento
 * otra con el año actual
 * 
 * Despues has de mostrar por pantalla tu edad con el uso de las
 * variables declaradas.
 * 
 */

public class ejercicio0203 {
    public static void main(String[] args) {

        int anoNacimiento = 1991 , anoActual = 2023;
        System.out.print("Han pasado " + (anoActual - anoNacimiento) + 
                         " años desde que naciste.");
    }
    
}
