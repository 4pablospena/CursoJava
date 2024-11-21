package Seccion3;

/*
 * Intuir el resultado de las expresiones logicas.
 * Despues mostrar el resultado en pantalla para comprobarlo.
 */
public class ejercicio0303 {
    public static void main (String [] args){

        int a = 3, b = 5 , c = 8 ;

        boolean e1 = a < 2 && b <= 5 || c == 8;
                // Se evalua primero la && y luego la ||
                // false && true || true
                // false || true --> e1 = true

        boolean e2 = a < 2 && (b <= 5 || c == 8);
                // Se evalua primero el parentesis y luego &&
                // false && (true || true)
                // false || true --> e2 = false

        boolean e3 = !(a < 2) && (b <= 5 || c == 8);
                // Se evalua primero parentesis, luego negacio y final &&
                // !false && (true || true)
                // !false && true
                // true || true --> e3 = true

        System.out.println("Comprobacion e1 = " + e1);
        System.out.println("Comprobacion e2 = " + e2);
        System.out.println("Comprobacion e3 = " + e3);

    }

    
}
