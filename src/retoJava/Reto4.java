package retoJava;

import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();

        System.out.print("Ingresa tus ingresos mensuales: ");
        double ingresos = sc.nextDouble();

        double prima;

        //Calculo segun la edad
        if (edad > 70){
            prima = 500;
        }else if (edad >= 50){
            prima = 400;
        } else if (edad >= 30) {
            prima = 250;
        }else {
            prima = 100;
        }

        // Ajuste según los ingresos
        if (ingresos >= 300){
            prima = prima * 1.10; //aumenta un 10%
        }else {
            prima = prima * 1.05; // Aumento del 5%
        }

        System.out.printf("Tu prima mensual es de: $%.2f", prima);
    }
}
