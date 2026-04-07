package retoJava;

import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Ingresa un texto: ");
        String texto = scn.nextLine();

        //Quitamos espacios y pasamos a minusculas
        texto = texto.replaceAll("\\s+", "").toLowerCase();

        String invertido = new StringBuilder(texto).reverse().toString();

        if (texto.equals(invertido)){
            System.out.println("Es un palíndromo");
        }else{
            System.out.println("No es palíndromo");
        }
    }
}
