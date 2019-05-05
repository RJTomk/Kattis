import java.util.Scanner;

public class Klept { // TODO: Figure out what's going on
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(), m = sc.nextInt();
    int[] lastChars = toIntArray(sc.next());
    int[] cipher = toIntArray(sc.next());
    sc.close();

    int[] key = new int[n];
    for (int i = 0; i < n; i++)
      key[i] = cipher[m - n + i] - lastChars[i];

    int k = 0;
    for (int i = 0; i < m; i++) {
      cipher[i] += key[k];
      cipher[i] %= 26;
      k = ((k + 1) == n) ? 0 : (k + 1);
    }

    System.out.println(toString(cipher));
  }

  private static int[] toIntArray(String s) {
    char[] c = s.toCharArray();
    int[] ret = new int[c.length];
    for (int i = 0; i < c.length; i++)
      ret[i] = c[i] - 'a';
    return ret;
  }

  private static String toString(int[] word) {
    String s = "";
    for (int i : word)
      s += (char)(i + 'a');

    return s;
  }
}
