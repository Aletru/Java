import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class rangooperaciones {
    public static void main (String[] args) throws IOException{
    int n;
    //BufferedReader num= new BufferedReader(new InputStreamReader(System.in));
    
    rangooperaciones ol = new rangooperaciones();
    
    System.out.println("proporciona un numero entero mayor 30 o menor a 70");
    n= Integer.parseInt(num.readLine());
    if (n<70 ){
        if (n>30){
         System.out.println("el numero esta dentro del intervalo");

        }
    } else {
        System.out.println("el numero esta fuera del intervalo");

    }
    
    }
}

/* realizar programa que determine un numero esta dentro del intervalo de 30 
a 70 
if((n>30)&& n<70){

} */
