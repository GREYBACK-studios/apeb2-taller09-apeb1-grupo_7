/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class Ejercicio_6_Nombres {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
        String inicial; 
        boolean bandera = true; 
        while (bandera) {
            System.out.print("Ingrese una letra: ");
            inicial = tcl.nextLine(); 

            for (String nombre : estudiantes) {  
                if (nombre.startsWith(inicial)) { 
                    System.out.println("¡Coincidencia encontrada con: " + nombre + "!");
                    bandera = false; 
                    break; 
                }
            }
            if (bandera) {
                System.out.println("No hay coincidencias, intente de nuevo.");
            }
        }
        System.out.println("");
    }
}
