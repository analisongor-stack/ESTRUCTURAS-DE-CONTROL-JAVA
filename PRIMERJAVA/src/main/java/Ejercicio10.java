/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BRITHANY CUENCA
 */
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cantidad = 10;
        int[] numeros = new int[cantidad];
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
            suma = suma + numeros[i];
        }
        double promedio = (double) suma / numeros.length;
 
        System.out.println("\nSuma: " + suma);
        System.out.println("Promedio: " + promedio);
        teclado.close();
    }
}
