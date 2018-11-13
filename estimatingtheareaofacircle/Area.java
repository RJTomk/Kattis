// Success in 0.32s
import java.util.*;

public class Area{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double rad = sc.nextDouble();
    int p      = sc.nextInt();
    int pi     = sc.nextInt();

    while(rad != 0.0){
      System.out.printf("%f %f\n", Math.PI * rad * rad, 4.0 * rad * rad * (double)pi / (double)p);

      rad = sc.nextDouble();
      p   = sc.nextInt();
      pi  = sc.nextInt();
    }

    sc.close();
  }
}
