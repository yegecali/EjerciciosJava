package Ejercicios;

import java.util.Scanner;

public class KmToM {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        double km;
        System.out.println("Ingrese la velocidad en Km/s:");
        km = sc.nextDouble();
        System.out.println(km + " Km/s -> " + km * 1000/3600 + " m/s");

    }
}
