/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package destructor;
import java.io.IOException;
/**
 *
 * @author angel
 */
public class Computadora {
 
public String marca=null;
public int capacidad =0;
public int ram=0;

public Computadora(String marca,int capacidad, int ram){
     this.marca=marca;
    this.capacidad=capacidad;
  
    this.ram=ram;
    
}

public void imprimirinfopc(){
    System.out.println("soy una computadora de marca: "+ marca + "con almacenamiento "+capacidad +"con GB de memoria  "+ram);
    
}
    
protected void finalize() throws Throwable{
 System.out.println("Eliminamos la pc " + this.marca +"\n");
 super.finalize();  
}
} /**
     * @param args the command line arguments
     */
    
    class person{
        public String primernombre = null;
        public String segundonombre = null;
        public int edad = 0;
        public String correo = null;
        public Computadora  computadora = null;
        
        public person(String primernombre, String segundonombre, int edad, String correo,String marca,int capacidad, int ram){
            this.primernombre = primernombre; 
            this.segundonombre = segundonombre;
            this.edad = edad;
            this.correo = correo;
            this.computadora = new Computadora(marca,ram,capacidad);
            
        }
        public void inprimirinfo(){
            System.out.println("minombre es  " + this.primernombre +this.segundonombre+"mi edad es "+this.edad + "años y mi doreccion de correo es "+ this.correo);
            this.computadora.imprimirinfopc();
            
        }
        protected void finalize()throws Throwable{
            System.out.println("Eliminamos el objeto " + this.primernombre +"\n");
            super.finalize();
        }
    }
    class Main{
        public static void main(String[] args) throws Throwable{
            person persona = new person("juan","romero",30,"rosalupe 300","dell", 512,8);
            System.out.println("\n");
            persona.inprimirinfo();
             System.out.println("\n");
             persona.finalize();
             person persona2 = new person("rosa","Anzurez",20,"clavario 40","compacq", 1024,16);
            System.out.println("\n");
            persona2.inprimirinfo();
             System.out.println("\n");
             persona2.finalize();
        } 
        
    }
