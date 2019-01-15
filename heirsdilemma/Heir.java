// Success in 0.17s
import java.util.Scanner;

public class Heir{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt(), h = sc.nextInt();
    sc.close();

    int count = 0;
    for(int i = l; i <= h; i++)
      if(div(i)) count++;

    System.out.println(count);
  }

  private static boolean div(int n){
    int m = n;
    boolean[] used = new boolean[10];
    while(m > 0){
      int r = m % 10;
      m = (m - r) / 10;

      if(used[r]) return false;
      used[r] = true;

      if(r == 0 || n % r != 0) return false;
    }

    return true;
  }
}
