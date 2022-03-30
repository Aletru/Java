import java.util.Scanner;
import java.io.*;

public class calcula {
    public static void main (String[] args){
        int max, suma=0;
        float media;
        Scanner sc= new Scanner(System.in);
        System.out.println("proporciona la cantidad de datos que vas a ingresar");
        max=sc.nextInt();

        //arreglo
        int vector[] = new int[max];
    
        ///primer ciclo para pedir valores del arreglo
        for (int i=0;i<=max-1;i++){
        System.out.println("ingresa el dato #"+(i+1)+": ");
        vector[i]= sc.nextInt();
        }

        //segundo ciclo ára la sumatoria del arreglo 
        for (int i=0;i<=max-1;i++){

            suma = suma +vector[i];
        }
        media= suma/max;
        System.out.println("la suma del arreglo de los datos es: "+suma);
        System.out.println("la media de los datos es: "+media);



    }    
}
