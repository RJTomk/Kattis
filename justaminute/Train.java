// TODO: Fix
import java.util.Scanner;

public class Train {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int trainSeconds = 0, realSeconds = 0;
    while (n-- > 0) {
      trainSeconds += sc.nextInt() * 60;
      realSeconds += sc.nextInt();
    }
    System.out.printf("%.9f", (double)realSeconds / (double)trainSeconds);
  }
}
