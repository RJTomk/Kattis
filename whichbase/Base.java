// Success in 0.18s
import java.util.Scanner;

public class Base{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      sc.nextInt();
      int v = sc.nextInt();
      System.out.printf("%d %d %d %d\n", i, fromOktal(Integer.toString(v)), v, fromHex(v));
    }
    sc.close();
  }

  private static int fromOktal(String v){
    for(char c : v.toCharArray())
      if (c == '9' || c == '8')
        return 0;

    return Integer.parseInt(v, 8);
  }

  private static int fromHex(int v){
    int ret = 0;
    int p = 1;
    while(v > 0){
      int n = v % 10;
      v -= n;
      v /= 10;

      ret += n * p;
      p *= 16;
    }

    return ret;
  }
}
