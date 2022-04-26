/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author captain
 */
public class persona {
    private String nombre;
    private String apellido;
    private int edad;
    
    public persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    } 
    public String getnombre(){
        return  nombre;
    }
    public String getapellido(){
        return  apellido;
    }
    public int getedad(){
        return  edad;
    }
}
