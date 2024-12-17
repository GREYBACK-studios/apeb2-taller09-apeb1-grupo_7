/**
 * Dado el arreglo; determinar cuantos elementos están arriba de la media aritmética 
 * y cuantos están por debajo de la medía aritmética.
 * int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
 * 
 */
public class Ejercicio_4_aritmetica {
    public static void main(String[] args) {
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int suma = 0, porEncima = 0, porDebajo = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        double media = (double) suma / arreglo.length;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > media) {
                porEncima++;
            } else if (arreglo[i] < media) {
                porDebajo++;
            }
        }
        System.out.println("La media aritmética es: " + media);
        System.out.println("Elementos por encima de la media: " + porEncima);
        System.out.println("Elementos por debajo de la media: " + porDebajo);
  }
 }
 /***
  * La media aritmética es: 9.538461538461538
  * Elementos por encima de la media: 8
  * Elementos por debajo de la media: 5
  */