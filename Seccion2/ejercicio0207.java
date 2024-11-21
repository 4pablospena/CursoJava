package Seccion2;

/*
 * Almacenar la poblacion de china y de la india (1400000000) cada una y luego sumarla
 * Primero con int
 * Segundo con long
 * 
 */

public class ejercicio0207 {
    public static void main(String[] args) {
        int iChina = 1400000000;
        int iIndia = 1450000000;
        int iSuma = iChina + iIndia ;

        System.out.println(iSuma); // se produce un desbordamiento.

        long lChina = 1400000000;
        long lIndia = 1450000000;
        long lSuma = lChina + lIndia;

        System.out.println(lSuma);
        
    }
}
