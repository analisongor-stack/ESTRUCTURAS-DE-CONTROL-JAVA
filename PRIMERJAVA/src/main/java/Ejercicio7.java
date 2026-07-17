/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Brithany cuenca
 */
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cantidad = 0;
        int suma = 0;
        int numero;
 
        System.out.println("Ingrese números positivos:");
 
        do {
            System.out.print("Ingrese un número: ");
            numero = teclado.nextInt();
 
            if (numero >= 0) {
                suma = suma + numero;
                cantidad++;
            }
        } while (numero >= 0);
 
        System.out.println("\nCantidad de números ingresados: " + cantidad);
        System.out.println("Suma total: " + suma);
 
        teclado.close();
    }
}