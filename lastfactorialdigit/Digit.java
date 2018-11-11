// Success in 0.07s
import java.util.Scanner;

public class Digit{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    while(n-- > 0){
      int val = 1;
      int fac = sc.nextInt();

      for(int i = 1; i <= fac; i++){
        val *= i;
        val -= Math.floorDiv(val, 10) * 10;
      }

      System.out.println(val);
    }
    sc.close();
  }
}
