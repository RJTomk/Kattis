// Success in 0.07s
import java.util.Scanner;

public class Life{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double qual = 0;

    while(n-- > 0){
      qual += sc.nextDouble() * sc.nextDouble();
    }

    sc.close();
    System.out.printf("%f", qual);
  }
}
