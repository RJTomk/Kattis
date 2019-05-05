// Success in 0.56s
import java.util.Scanner;

public class Gnoblin {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nPack = sc.nextInt(); sc.nextLine();
    while (nPack-- > 0) {
      int[] line = toIntArray(sc.nextLine());
      for (int i = 1; i < line.length; i++)
        if (line[i - 1] + 1 != line[i]) {
          System.out.println(i + 1);
          break;
        }
    }

    sc.close();
  }

  private static int[] toIntArray(String s) {
    Scanner sc = new Scanner(s);
    int n = sc.nextInt();
    int[] ret = new int[n];
    for (int i = 0; i < n; i++)
      ret[i] = sc.nextInt();
    sc.close();
    return ret;
  }
}
