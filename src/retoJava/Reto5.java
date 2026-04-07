package retoJava;

import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Autenticación
        System.out.print("Ingresa tu usuario: ");
        String usuario = sc.nextLine();

        System.out.print("Ingrese su contraseña: ");
        String password = sc.nextLine();

        if (usuario.equals("admin") && password.equals("1234")) {
            int opcion;
            do {
                System.out.println("\n---Menú Bancario ---");
                System.out.println("1. Consultar saldo");
                System.out.println("2. Ingresar dinero");
                System.out.println("3. Retirar dinero");
                System.out.println("4. Consultar últimos movimientos");
                System.out.println("5. Convertir divisas");
                System.out.println("0. Salir");
                System.out.print("Seleccione una opción: ");

                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Tu saldo es de: 1000");
                        break;
                    case 2:
                        System.out.println("Haz ingresado dinero.");
                        break;
                    case 3:
                        System.out.println("Haz retirado dinero");
                        break;
                    case 4:
                        System.out.println("últimos movimientos: Depósito de $500");
                        break;
                    case 5:
                        System.out.println("Seleccione la conversión: ");
                        System.out.println("1. MXN a USD");
                        System.out.println("2. USD a MXN");
                        System.out.println("3. MXN a EUR");
                        System.out.println("4. EUR a MXN");
                        System.out.println("5. USD a EUR");
                        System.out.println("6. EUR a USD");
                        int conversion = sc.nextInt();

                        System.out.print("Ingresa la cantidad: ");
                        double cantidad = sc.nextDouble();

                        double resultado = 0;

                        // Tasas de ejemplo
                        double tasaMXN_USD = 0.055; // 1 MXN = 0.055 USD
                        double tasaMXN_EUR = 0.050; // 1 MXN = 0.050 EUR
                        double tasaUSD_EUR = 0.90;  // 1 USD = 0.90 EUR

                        switch (conversion) {
                            case 1:
                                resultado = cantidad * tasaMXN_USD;
                                System.out.println(cantidad + " MXN = " + resultado + " USD");
                                break;
                            case 2:
                                resultado = cantidad / tasaMXN_USD;
                                System.out.println(cantidad + " USD = " + resultado + " MXN");
                                break;
                            case 3:
                                resultado = cantidad * tasaMXN_EUR;
                                System.out.println(cantidad + " MXN = " + resultado + " EUR");
                                break;
                            case 4:
                                resultado = cantidad / tasaMXN_EUR;
                                System.out.println(cantidad + " EUR = " + resultado + " MXN");
                                break;
                            case 5:
                                resultado = cantidad * tasaUSD_EUR;
                                System.out.println(cantidad + " USD = " + resultado + " EUR");
                                break;
                            case 6:
                                resultado = cantidad / tasaUSD_EUR;
                                System.out.println(cantidad + " EUR = " + resultado + " USD");
                                break;
                            default:
                                System.out.println("Conversión inválida.");
                        }
                        break;
                    case 0:
                        System.out.println("Saliendo del sistema...");
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
            } while (opcion != 0);
        } else {
            System.out.println("Usuario o contraseña invalidos");
        }
    }
}
