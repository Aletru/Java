import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inversion {

  public static void main(String[] args) throws IOException{
  int resultado,i1,i2,i3,i4,p1,p2,p3,p4;
  BufferedReader sc= new BufferedReader(new InputStreamReader(System.in));
  inversion ol = new inversion();
  System.out.println("cantidad de inversionista 1");
  i1= Integer.parseInt(sc.readLine());
  System.out.println("cantidad de inversionista 2");
  i2= Integer.parseInt(sc.readLine());
  System.out.println("cantidad de inversionista 3");
  i3= Integer.parseInt(sc.readLine());
  System.out.println("cantidad de inversionista 4");
  i4= Integer.parseInt(sc.readLine());
  resultado= i1+i2+i3+i4;
  p1= (i1*100)/resultado;
  p2= (i2*100)/resultado;
  p3= (i3*100)/resultado;
  p4= (i4*100)/resultado;

  System.out.println("la inversion es del: "+p1+"%");
  System.out.println("la inversion es del: "+p2+"%");
  System.out.println("la inversion es del: "+p3+"%");
  System.out.println("la inversion es del: "+p4+"%");
  }


}