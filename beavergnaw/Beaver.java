import java.util.Scanner;

public class Beaver{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while(true){
      double D = sc.nextDouble();
      double V = sc.nextDouble();

      if (D == 0 && V == 0)
        break;

      System.out.println(Math.cbrt((((-6) * V) / Math.PI) * (D * D * D)));
    }

    sc.close();
  }
}
