// Success in 0.34s
import java.util.Scanner;

public class Heart{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    while(n-- > 0){
      int b = sc.nextInt();
      double p = sc.nextDouble();
      double x = 60.0 / p;
      double xb = x * b;

      System.out.printf("%.4f %.4f %.4f\n", xb - x, xb, xb + x);
    }

    sc.close();
  }
}
