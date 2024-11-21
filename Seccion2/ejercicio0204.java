package Seccion2;

/*
 * Declara una variable llamada "valor" con valor inicial 3
 * Muestra el valor acumulado de cada resultado parcial al:
 * Sumarle 5
 * multiplicarla por 4
 * dividirla entre 2
 */

public class ejercicio0204 {
    public static void main(String[] args) {
        
    int valor = 3;
    System.out.println(valor);  //3

    valor += 5;
    System.out.println(valor);  //8

    valor *= 4;
    System.out.println(valor);  //32

    valor /= 2;
    System.out.println(valor);  //16

    }
}