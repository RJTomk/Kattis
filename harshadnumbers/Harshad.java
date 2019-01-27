// Success in 0.14s
import java.util.Scanner;

public class Harshad{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    while(!hars(n)) n++;

    System.out.println(n);
  }

  private static boolean hars(int i){
    int x = i;
    int s = 0;
    while(i > 9){
      s += i % 10;
      i /= 10;
    }
    s += i;

    return x % s == 0;
  }
}
