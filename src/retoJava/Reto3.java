package retoJava;

import java.util.Random;
import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random random = new Random();

        int secreto = random.nextInt(10) + 1; // Un numero entre el 1 y el 10
        int intento = 0;

        System.out.println("*** Adivina el numero entre el 1 y el 10 ***");

        while (intento != secreto){
            System.out.print("Ingresa tu número: ");
            intento = scn.nextInt();

            if (intento < secreto){
                System.out.println("Tu número es menor al secreto!");
            } else if (intento > secreto) {
                System.out.println("Tu número es mayor al secreto!");
            } else {
                System.out.println("Correcto! El numero era " + secreto);
            }
        }
    }
}
