package retoJava;

import java.util.Scanner;

public class Reto6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos términos de Fibonacci quieres generar?: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        System.out.println("Secuencia de Fibonacci:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }

        sc.close();
    }
}
