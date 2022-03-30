import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class uno {

  public static void main(String[] args) throws IOException{
  int num1,num2,resultado;
  BufferedReader sc= new BufferedReader(new InputStreamReader(System.in));
  uno ol = new uno();
  System.out.println("proporciona un numero entero del 0 al 20");
  num1= Integer.parseInt(sc.readLine());
  System.out.println("proporciona un numero entero del 0 al 20");
  num2= Integer.parseInt(sc.readLine());
  resultado= num1 + num2;

  System.out.println("el resultado de la suma es: "+resultado);
    }


}