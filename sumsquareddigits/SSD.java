// Success in 0.28s
import java.util.Scanner;

public class SSD{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    while(n-- > 0){
      int N         = sc.nextInt();
      int b         = sc.nextInt();
      char[] digits = Long.toString(sc.nextLong(), b).toCharArray();
      int sum       = 0;

      for(char d : digits){
          int v = Integer.parseInt(Character.toString(d), b);
          sum += v * v;
      }

      System.out.printf("%d %d\n", N, sum);
    }

    sc.close();
  }
}
