import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class pitagoras {

  public static void main(String[] args) throws IOException{
  double a,b, solucion;
  BufferedReader sc= new BufferedReader(new InputStreamReader(System.in));
  pitagoras ol = new pitagoras();
  System.out.println("proporciona el valor del cateto a");
  a= Integer.parseInt(sc.readLine());
  System.out.println("porporciona el valor del cateto b");
  b= Integer.parseInt(sc.readLine());
  solucion= (a*a) + (b*b);
  solucion= Math.sqrt(solucion);
  
  System.out.println(String.format("la hipotenusa es: %.2f",solucion));
    }


}
