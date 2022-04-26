/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package destructor;

/**
 *
 * @author captain
 */
import java.io.IOException;

public class dos {
   
    public String nombre=null;
    public int edad=0;
    
    public dos(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public void impirmir(){
        System.out.println("minombres es "+nombre+"y tengo la edad de "+edad);
    }
    protected void finalize() throws Throwable{
        System.out.println("se elimino al usuairo "+ this.nombre);
        super.finalize();
    }
     /**
     * @param args the command line arguments
     */
   

}
     class Main{
        public static void main(String[] args) throws Throwable{
        dos persona = new dos ("juanito", 33);
        System.out.println("\n");
        persona.impirmir();
        System.out.println("\n");
        persona.finalize();
        } 
        
    }



