/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author captain
 */
public class Estudiante extends persona {
    private int codigoEstudiante;
    private float notafinal;
    public Estudiante (String nombre, String apellido, int edad, int codigoEstudiante, float notafinal) {
    
    super(nombre,apellido, edad);
    this.codigoEstudiante=codigoEstudiante;
    this.notafinal=notafinal;
    }
    public void mostrardatos(){
        System.out.println("nombre" + getnombre() + "\napellido" + getapellido() + 
                "\nedad" + getedad() + 
                "\n codigo de estudiante" + codigoEstudiante +
                "\n nota final " + notafinal);
    }
    
    
    
}
