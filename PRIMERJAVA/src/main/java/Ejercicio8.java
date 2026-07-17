/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BRITHANY CUENCA
 */
import java.util.Scanner;
 
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String contraseñaCorrecta = "java2026";
        String contraseñaIngresada;
        do {
            System.out.print("Ingrese la contraseña: ");
            contraseñaIngresada = teclado.nextLine();
        } while (!contraseñaIngresada.equals(contraseñaCorrecta));
        System.out.println("Acceso concedido.");
        teclado.close();
    }
}