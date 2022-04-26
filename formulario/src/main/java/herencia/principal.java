/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

import java.util.Scanner;
/**
 *
 * @author captain
 */
public class principal {
    
    public static void main (String[] args ){
        String nombre, apellido;
        int edad=0,codigoEstudiante=0; 
        float notafinal=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa nombre del alumno: ");
        nombre = scanner.nextLine();
        System.out.print("Ingresa nombre del alumno: ");
        apellido = scanner.nextLine();
        System.out.print("Ingresa nombre del alumno: ");
        edad = scanner.nextInt();
        System.out.print("Ingresa nombre del alumno: ");
        codigoEstudiante = scanner.nextInt();
        System.out.print("Ingresa nombre del alumno: ");
        notafinal = scanner.nextFloat();
        Estudiante Estudiante = new Estudiante(nombre,apellido, edad, codigoEstudiante,notafinal);
        Estudiante.mostrardatos(); 
        
        
    }
}
