/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructor;

/**
 *
 * @author captain
 */
public class lampara {
    private String color;
    private boolean encendida;
    public lampara(){
        this("gris");
    }
    public lampara(String color){
        this(color,true);
    }
    public lampara(String color,boolean estaEncendida){
        this.color=color;
        this.encendida= estaEncendida;
       
    }
    @Override
    public String toString(){
        return "esta lampara es"
                + color + " y esta encendida " + encendida;
    }
    
}

class lamparaCreator{
        public static void main(String[] args){
            lampara lampara = new lampara();
            lampara lampara1 = new lampara("roja");
            lampara lampara2 = new lampara ("roja", false);
            
            System.out.println(lampara);
            System.out.println(lampara1);
            System.out.println(lampara2);
        }
}

//.los contructores pueden ser public, private o protected