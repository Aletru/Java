import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class empleado {
    public static void main (String[] args) throws IOException{
    double h=70,nh, st;
    BufferedReader num= new BufferedReader(new InputStreamReader(System.in));
    empleado ol = new empleado();
    
    System.out.println("ingresa horas trabajadas");
    nh= Integer.parseInt(num.readLine());
    if (nh <= 40 ){
        
        st= nh * 70;
      
    } else {
        st=40*h+(nh-40)*2*h;
    }
    System.out.println("el sueldo es: "+st);
    
    }
}
/* realizar un programa que indique la cantidad de dinero que va a recibir un empleado
por concepto de horas trabajadas, si el empeleado trabaja 40 hrs o menos la hora se le 
pagara a 70 pesos , si trabajo mas de 40 hrs las primeras 40 se pagan normal y las restantes 
al doble  */


