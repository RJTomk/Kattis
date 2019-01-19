//Success in 0.69s
import java.util.Scanner;

public class Candle{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int i = 1; i <= n; i++){
      sc.nextInt(); //dont care
      int days = sc.nextInt(), candles = 0;
      for(int j = 2; j < days + 2; j++)
        candles += j;

      System.out.printf("%d %d\n", i, candles);
    }

    sc.close();
  }
}
