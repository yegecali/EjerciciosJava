package Scanner;

import java.util.Scanner;

public class UsoScanner {
    public static void main (String [] args){
        int n1, n2;
        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingrese el Primer numero:");
//        n1 = sc.nextInt();
//        System.out.println("Ingrese el Segundo numero:");
//        n2 = sc.nextInt();
//        System.out.println("El resultado de sumar: " + n1 + " + " + n2 + " = " + (n1+ n2));

        System.out.println("Ingrese su nombre:");
        String nombre = sc.nextLine();
        System.out.println("Hola: " + nombre);
    }
}
