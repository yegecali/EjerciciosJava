package Ejercicios;

import java.util.Scanner;

public class CentigradosToFahrenheit {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        double gradosC;
        double gradosF;
        System.out.println("Ingrese los grados Centigrados:");
        gradosC = sc.nextDouble();
        gradosF = 32 + (9 * gradosC/5);
        System.out.println("El Grado C° " + gradosC + " convertido en F° es " + gradosF );
    }
}
