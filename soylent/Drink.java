// Success in 0.12s
import java.util.Scanner;

public class Drink{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while(n-- > 0){
      System.out.println((int)Math.ceil(sc.nextDouble() / 400F));
    }

    sc.close();
  }
}
