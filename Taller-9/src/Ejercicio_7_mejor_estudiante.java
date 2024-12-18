/***
 *
 * 
 */
import java.util.Random;
public class Ejercicio_7_mejor_estudiante {
    public static void main(String[] args) {
        // Declaración de variables
        String[] estudiantes = {
            "Estudiante 1", "Estudiante 2", "Estudiante 3", "Estudiante 4", "Estudiante 5",
            "Estudiante 6", "Estudiante 7", "Estudiante 8", "Estudiante 9", "Estudiante 10",
            "Estudiante 11", "Estudiante 12", "Estudiante 13", "Estudiante 14", "Estudiante 15",
            "Estudiante 16", "Estudiante 17", "Estudiante 18", "Estudiante 19", "Estudiante 20",
            "Estudiante 21", "Estudiante 22", "Estudiante 23", "Estudiante 24", "Estudiante 25",
            "Estudiante 26", "Estudiante 27", "Estudiante 28"
        };
        double[] notas = new double[28];
        Random random = new Random();
        for (int i = 0; i < notas.length; i++) {
            notas[i] = Math.round((random.nextDouble() * 10) * 100.0) / 100.0; 
        }
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        double promedioCiclo = suma / notas.length;
        double mejorNota = notas[0];
        double peorNota = notas[0];
        int indiceMejor = 0, indicePeor = 0;
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > mejorNota) {
                mejorNota = notas[i];
                indiceMejor = i;
            }
            if (notas[i] < peorNota) {
                peorNota = notas[i];
                indicePeor = i;
            }
        }
        System.out.println("Promedio del ciclo, paralelo C: " + promedioCiclo);
        System.out.println("\nEstudiantes con nota por encima del promedio:");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > promedioCiclo) {
                System.out.println(estudiantes[i] + " - Nota: " + notas[i]);
            }
        }
        System.out.println("\nEstudiantes con nota por debajo del promedio:");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < promedioCiclo) {
                System.out.println(estudiantes[i] + " - Nota: " + notas[i]);
            }
        }
        System.out.println("\nEstudiante con la mejor calificación:");
        System.out.println(estudiantes[indiceMejor] + " - Nota: " + mejorNota);
        System.out.println("\nEstudiante con la calificación más baja:");
        System.out.println(estudiantes[indicePeor] + " - Nota: " + peorNota);
    }
}
/***
 * Promedio del ciclo, paralelo C: 4.561785714285714
 *
 * Estudiantes con nota por encima del promedio:
 * Estudiante 1 - Nota: 7.22
 * Estudiante 2 - Nota: 7.2
 * Estudiante 3 - Nota: 6.07
 * Estudiante 4 - Nota: 7.29
 * Estudiante 6 - Nota: 6.32
 * Estudiante 7 - Nota: 5.04
 * Estudiante 9 - Nota: 5.4
 * Estudiante 13 - Nota: 7.77
 * Estudiante 14 - Nota: 9.21
 * Estudiante 17 - Nota: 8.26
 * Estudiante 19 - Nota: 9.5
 * Estudiante 22 - Nota: 9.46
 * Estudiante 23 - Nota: 7.98
 * Estudiante 28 - Nota: 7.81
 *
 * Estudiantes con nota por debajo del promedio:
 * Estudiante 5 - Nota: 0.03
 * Estudiante 8 - Nota: 0.27
 * Estudiante 10 - Nota: 2.32
 * Estudiante 11 - Nota: 4.0
 * Estudiante 12 - Nota: 0.68
 * Estudiante 15 - Nota: 3.82
 * Estudiante 16 - Nota: 4.05
 * Estudiante 18 - Nota: 0.01
 * Estudiante 20 - Nota: 1.01
 * Estudiante 21 - Nota: 1.55
 * Estudiante 24 - Nota: 1.62
 * Estudiante 25 - Nota: 2.91
 * Estudiante 26 - Nota: 0.1
 * Estudiante 27 - Nota: 0.83
 *
 * Estudiante con la mejor calificación:
 * Estudiante 19 - Nota: 9.5
 * 
 * Estudiante con la calificación más baja:
 * Estudiante 18 - Nota: 0.01
 */