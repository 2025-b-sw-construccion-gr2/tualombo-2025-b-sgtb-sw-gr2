import Suma.Suma;
import Resta.resta;

import java.util.Scanner;

public class AppCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, opcion;

        System.out.println("=== Calculadora Modular ===");
        System.out.print("Ingrese el primer número: ");
        a = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        b = sc.nextInt();

        System.out.println("\nSeleccione la operación:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Resultado de la suma: " + Suma.sumar(a, b));
                break;
            case 2:
                System.out.println("Resultado de la resta: " + resta.restar(a, b));
                break;
            default:
                System.out.println("Opción no válida.");
        }

        sc.close();
    }
}
