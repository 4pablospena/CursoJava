package Seccion4;
import java.util.Scanner;

/*
 * Almacena en un tipo enumerado los meses del año.
 * Despues le pedira al usuario que escriba uno de esos meses y luego
 * muestre por pantalla el numero de dias que tiene ese mes. (Febreo tiene 28 dias)
 */

public class ejercicio0405 {

    enum Meses { ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO,
        JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE };
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numeroMes;
        String nombreMes;
        
        int[] diasMes = {31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31};
        
        System.out.println("Dime el numero de mes (1 a 12) ");
        numeroMes = sc.nextInt();
        sc.nextLine();
    
        System.out.println("El mes es " + Meses.values()[numeroMes-1]);
        System.out.println("Dias: " + diasMes[numeroMes-1]);
        
        System.out.println("Dime el nombre de mes: ");
        nombreMes = sc.nextLine();
        Meses mesEscogido = Meses.valueOf(nombreMes);
        
        System.out.println("El mes es " + mesEscogido);
        System.out.println("Dias: " + diasMes[mesEscogido.ordinal()]);

        sc.close();
    }
}