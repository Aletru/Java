import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class calificacio {

  public static void main(String[] args) throws IOException{
  double cal1,cal2,cal3,promedio,calL,nf;
  BufferedReader sc= new BufferedReader(new InputStreamReader(System.in));
  calificacio ol = new calificacio ();
  System.out.println("proporciona la calificacion 1");
  cal1= Integer.parseInt(sc.readLine());
  System.out.println("porporciona la calificacion 2");
  cal2= Integer.parseInt(sc.readLine());
  System.out.println("porporciona la calificacion 3");
  cal3= Integer.parseInt(sc.readLine());
  promedio= (cal1+cal2+cal3)/3;
  

  System.out.println("su promedio es: "+promedio);
    }


}
