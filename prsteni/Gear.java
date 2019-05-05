// Success in 0.17s
import java.util.Scanner;

public class Gear {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt() - 1;
    int f = sc.nextInt();

    while (n-- > 0) {
      int g = sc.nextInt();
      int d = gcd(f, g);
      System.out.printf("%d/%d\n", f / d, g / d);
    }

    sc.close();
  }

  private static int gcd(int a, int b) {
    if (a == 0)
      return b;
    if (b == 0)
      return a;

    if (a == b)
      return a;

    if (a > b)
      return gcd(a - b, b);
    return gcd(a, b-a);
  }
}
