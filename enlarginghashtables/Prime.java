// Success in 0.37s
import java.util.Scanner;

public class Prime{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    while((n = sc.nextInt()) != 0){
      int p = 2 * n + 1;
      while(isNotPrime(p)) p += 2;
      System.out.printf("%d%s\n", p, isNotPrime(n) ? (" (" + n + " is not prime)") : "");
    }

    sc.close();
  }

  private static boolean isNotPrime(int n){
    if(n == 2) return false;
    else if(n % 2 == 0) return true;

    Double sq = Math.sqrt(n);
    for(int t = 3; t <= sq; t += 2)
      if(n % t == 0)
        return true;
    return false;
  }
}
