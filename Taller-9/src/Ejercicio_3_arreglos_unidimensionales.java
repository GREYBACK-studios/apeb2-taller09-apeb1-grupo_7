/**
 * Genera una aplicación que permita ingresar valores a un arreglo de cadenas. 
 * El arreglo almacena el número de elementos que el usuario lo disponga. 
 * Se puede plantear el escenario que se ingresen nombres de marcas de vehículos.
 * Por ejemplo, si el usuario decide ingresar 5 marcas; el arreglo solo debe permitir ingresar ese número elementos.
 * Considerar las siguientes excepciones, no se contabilizan dentro del número de elementos, marcas que empiecen 
 * con las letras A, C, T.
 * 
 */
import java.util.Scanner;
public class Ejercicio_3_arreglos_unidimensionales {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n;
        System.out.print("Ingrese la cantidad de marcas que desea almacenar: ");
        n = tcl.nextInt();
        tcl.nextLine();
        String[] marcas = new String[n];
        System.out.println("Ingrese los nombres de las marcas:");
        for (int i = 0; i < n; ) {
            System.out.print("Marca " + (i + 1) + ": ");
            String marca = tcl.nextLine();
            char inicial = Character.toUpperCase(marca.charAt(0));
            if (inicial == 'A' || inicial == 'C' || inicial == 'T') {
                System.out.println("La marca no es válida porque empieza con A, C o T. Intente de nuevo.");
            } else {
                marcas[i] = marca;
                i++; 
            }
        }
        System.out.println("\nLas marcas almacenadas son:");
        for (String marca : marcas) {
            System.out.println(marca);
        }
    }
}
/***
 * Ingrese la cantidad de marcas que desea almacenar: 4
 * Ingrese los nombres de las marcas:
 * Marca 1: Toyota
 * La marca no es válida porque empieza con A, C o T. Intente de nuevo.
 * Marca 1: BWM
 * Marca 2: NISSAN
 * Marca 3: PORSCHE
 * Marca 4: FORD

 * Las marcas almacenadas son:
 * BWM
 * NISSAN
 * PORSCHE
 * FORD
 */
