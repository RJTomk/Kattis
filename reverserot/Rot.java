// Success in 0.20s
import java.util.Scanner;

public class Rot {
  private static char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','_','.'};
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rot;
    while((rot = sc.nextInt()) != 0) {
      char[] s = sc.next().toCharArray();
      String ret = "";

      for (int i = s.length - 1; i >= 0; i--)
        ret += rotate(s[i], rot);

      System.out.println(ret);
    }

    sc.close();
  }

  private static char rotate(char c, int rot) {
    int v;
    if (c == '_') v = 26;
    else if (c == '.') v = 27;
    else v = c - 'A';

    v += rot;
    v %= 28;
    return alphabet[v];
  }
}
