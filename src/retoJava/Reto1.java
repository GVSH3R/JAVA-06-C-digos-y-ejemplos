package retoJava;

import java.util.Random;
import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Ingresa el numero total de participantes: ");
        int total = scn.nextInt();

        Random random = new Random();
        int ganador = random.nextInt(total) + 1;

        System.out.println("El numero ganador es: " + ganador);
    }
}
