// Success in 0.07s
import java.util.Scanner;

public class Dice{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int
    n = sc.nextInt(),
    m = sc.nextInt();

    sc.close();

    for(int i = Math.min(n, m) + 1; i <= Math.max(n, m) + 1; i++)
      System.out.println(i);
  }
}
