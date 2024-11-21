package Seccion2;

/*
 *  Calcula a mano: 
 *      4 * 3 + 5 % 2 * 6
 *      4 * (3 + 5) % (2 * 6)
 * 
 *  Despues comprueba el rsultado mostrandolo en pantalla:
 * 
 */

public class ejercicio0202 {

    /*
     * Calculo:
     * 4 * 3 + 5 % 2 * 6
     * 12 + 1 * 6
     * 12 + 6
     * 18
     * 
     * Calculo:
     * 4 * (3 + 5) % (2 * 6)
     * 4 * 8 % 12
     * 32 % 12
     * 8
     */

     public static void main(String[] args) {
        System.out.println(4 * 3 + 5 % 2 * 6);
        System.out.println(4 * (3 + 5) % (2 * 6));
     }
    
}
