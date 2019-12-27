// Success in 0.14s
import java.util.Scanner;

public class Orbit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = 1;
    while(sc.hasNextInt()){
      int earth = sc.nextInt();
      int mars = sc.nextInt();

      int i = 0;
      while(((earth + i) % 365) != 0 || ((mars + i) % 687) != 0)
        i++;

      System.out.printf("Case %d: %d\n", n, i);
      n++;
    }
  }
}
