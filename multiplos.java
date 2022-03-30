import java.util.Scanner;
import java.io.*;

public class multiplos {
    public static void main (String[] args){
        int max;
        int num=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("de que tamaño quieres tu arreglo ");
        max=sc.nextInt();
        System.out.println("ingresa el numero 3 para hallar sus multiplos ");
        num=sc.nextInt();

        //arreglo
        int vector[] = new int[max];
    
        ///primer ciclo para pedir valores del arreglo
        for (int i=0;i<=max-1;i++){
       
        vector[i]= (i+1)*num;
        System.out.println(""+vector[i]);
        }

        //segundo ciclo ára la sumatoria del arreglo 
     
       
   



    }    
}


