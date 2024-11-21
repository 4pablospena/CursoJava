package Seccion2;

/*
 * PREDECIR el resultado de lo que va saliendo en el 
 * codigo predefinido y ver si el resultado es el correcto.
 */

public class ejercicio0214 {
    public static void main(String[] args) {
        
        //PREDICCION 1:

        int n = 1, a = 3 , b = 4;
        a = b + n++;            // n = 2, a = 5 , b = 4
        n *= 3;                 // n = 6, a = 5 , b = 4
        n = n + a + b * a;      // n = 31, a = 5 , b = 4

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("n = " + n);
     

        //PREDICCION 2:
        int s = 5, m = 5 , p = 2;
        m = m / p;              //s = 5, m = 2 , p = 2
        m += ++s;               //s = 6, m = 8, p = 2
        s *= p + m;             //s = 60, m = 8, p = 2

        System.out.println("s = " + s);
        System.out.println("m = " + m);
        System.out.println("p = " + p);

    }
}
