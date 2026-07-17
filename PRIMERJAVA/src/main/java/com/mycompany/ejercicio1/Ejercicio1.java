/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;


/**
 *
 * @author Brithany Cuenca 
 */
import java.util.Scanner;
 
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
 
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
 
        System.out.print("Ingrese su carrera: ");
        String carrera = sc.nextLine();
 
        System.out.print("Ingrese su estatura (m): ");
        double estatura = sc.nextDouble();
 
        System.out.println("\nDatos ingresados:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Estatura: " + estatura);
 
        sc.close();
    }
}
 