/**
 *Escriba un programa que permita presentar la siguiente serie:
 * 1/2, 1/3, 2/5, 3/7, 5/11, 8/13, . . . fibonaccis / primos 
 * 
 */
import java.util.Scanner;
public class Ejercicio_2_serie {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int a = 1, b = 1, contadorPrimos = 0,numero = 2, n;
        System.out.print("Ingrese el número de términos que desea en la serie: ");
        n = tcl.nextInt();
        System.out.println("La serie es:");
        for (int i = 1; i < n; i++) {
            System.out.print(a + "/");
            while (true) {
                boolean esPrimo = true;
                for (int j = 2; j <= Math.sqrt(numero); j++) {
                    if (numero % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }
                if (esPrimo) {
                    System.out.print(numero);
                    numero++;
                    break;
                }
                numero++;
            }
            int temp = a + b;
            a = b;
            b = temp;

            if (i < n - 1) {
                System.out.print(", ");
            }
        }
    }
}
/***
 * Ingrese el número de términos que desea en la serie: 10
 * La serie es:
 * 1/2, 1/3, 2/5, 3/7, 5/11, 8/13, 13/17, 21/19, 34/23
 */