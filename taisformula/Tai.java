// Success in 0.50s
import java.util.Scanner;

public class Tai{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt() - 1;
    int t1 = sc.nextInt();
    double v1 = sc.nextDouble(), area = 0;

    while(n-- > 0){
      int t2 = sc.nextInt();
      double v2 = sc.nextDouble();

      area += (((v2 + v1) / 2) * (t2 - t1)) / 1000;
      t1 = t2;
      v1 = v2;
    }
    System.out.printf("%f\n", area);
    sc.close();
  }
}
