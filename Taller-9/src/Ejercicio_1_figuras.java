/**
 *Con el objetivo practicar el uso del ciclo repetitivo for, 
 * se propone que dado un límite, se presenten las siguientes figuras. Por ejemplo si el límite es 4:
 * 
 */
import java.util.Scanner;
public class Ejercicio_1_figuras {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int limite;
        // Pedimos el límite al usuario
        System.out.print("Ingrese el límite: ");
        limite = tcl.nextInt();
        // Figura 1: Triángulo rectángulo
        System.out.println("Figura 1:");
        for (int i = 1; i <= limite; i++) {
            for (int j = 1; j <= i; j++) {
            System.out.print("*"); // Imprimimos un asterisco
            }
            System.out.println(); // Cambiamos de línea
        }
        // Figura 2: Pirámide
        System.out.println("\nFigura 2:");
        for (int i = 1; i <= limite; i++) {
            // Espacios a la izquierda
            for (int j = 1; j <= limite - i; j++) {
                System.out.print(" ");
            }
            // Asteriscos
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println(); // Cambiamos de línea
        }

        // Figura 3: Rombo
        System.out.println("\nFigura 3:");
        // Parte superior del rombo
        for (int i = 1; i <= limite; i++) {
            for (int j = 1; j <= limite - i; j++) {
                System.out.print(" "); // Espacios
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*"); // Asteriscos
            }
            System.out.println();
        }
        // Parte inferior del rombo
        for (int i = limite - 1; i >= 1; i--) {
            for (int j = 1; j <= limite - i; j++) {
                System.out.print(" "); // Espacios
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*"); // Asteriscos
            }
            System.out.println();
        }
    }
}

/***
 * Ingrese el límite: 4
 * Figura 1:
 * *
 * **
 * ***
 * ****

 * Figura 2:
 *    *
 *   ***
 *  *****
 * *******

 * Figura 3:
 *    *
 *   ***
 *  *****
 * *******
 *  *****
 *   ***
 *    *
 */