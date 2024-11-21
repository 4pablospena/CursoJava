package Seccion3;
import java.util.Scanner;
/*
 * Programa que pida al usuario un nombre de un mes y
 * se muestre por pantalla los dias del mes que tiene.
 * Primero con switch
 * segundo con if-else
 */

public class ejercicio0305 {
    public static void main(String[] args) {
        
        //Primer caso, hacerlo con switch

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el nombre de un mes (En mayusculas)");
        String nombreMes = sc.nextLine();

        switch(nombreMes){
            case "ENERO":
            case "MARZO":
            case "MAYO":
            case "JULIO":
            case "AGOSTO":
            case "OCTUBRE":
            case "DICIEMBRE":
                System.out.println("El mes tiene 31 días.");
                break;
            case "ABRIL":
            case "JUNIO":
            case "SEPTIEMBRE":
            case "NOVIEMBRE":
                System.out.println("El mes tiene 30 días.");
                break;
            case "FEBRERO":
                System.out.println("El mes tiene 28 días.");
                break;
            default:
                System.out.println("No conozco ese mes.");
        }
        
        //Segundo paso, realizarlo con If-else
    
        System.out.println("Escribe el nombre de un mes (En mayusculas)");
        String mes = sc.nextLine();
    

        if (mes.equals("ENERO")){
            System.out.println("El mes tiene 31 días");
        }else if (mes.equals("FEBRERO")){
            System.out.println("El mes tiene 28 días");
        }else if (mes.equals("MARZO")){
            System.out.println("El mes tiene 31 días");
        }else if (mes.equals("ABRIL")){
            System.out.println("El mes tiene 30 días");
        }else if (mes.equals("MAYO")){
            System.out.println("El mes tiene 31 días");
        }else if (mes.equals("JUNIO")){
            System.out.println("El mes tiene 30 días");
        }else if (mes.equals("JULIO")){
            System.out.println("El mes tiene 31 días");
        }else if (mes.equals("AGOSTO")){
            System.out.println("El mes tiene 31 días");
        }else if (mes.equals("SEPTIEMBRE")){
            System.out.println("El mes tiene 30 días");
        }else if (mes.equals("OCTUBRE")){
            System.out.println("El mes tiene 31 días");
        }else if (mes.equals("NOVIEMBRE")){
            System.out.println("El mes tiene 30 días");
        }else if (mes.equals("DICIEMBRE")){
            System.out.println("El mes tiene 31 días");
        }else{
            System.out.println("No conozco ese mes.");
        }

        sc.close();
    }
 }

