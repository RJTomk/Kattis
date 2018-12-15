// Success in 0.24s
import java.util.Scanner;

public class Fractions{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int den = sc.nextInt();

    while(num != 0 && den != 0){
      System.out.printf("%d %d / %d\n", num / den, num % den, den);
      num = sc.nextInt();
      den = sc.nextInt();
    }


    sc.close();
  }
}
