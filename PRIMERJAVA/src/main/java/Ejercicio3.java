/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Brithany Cuenca 
 */
import java.util.Scanner;
 
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
 
        System.out.print("Ingrese la edad de la persona: ");
        int edad = teclado.nextInt();
 
        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        }
 
        teclado.close();
    }
}