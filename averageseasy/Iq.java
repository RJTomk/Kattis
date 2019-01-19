// Success in 0.21s
import java.util.Scanner;

public class Iq{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while(n-- > 0){
      int nC = sc.nextInt(), nE = sc.nextInt();
      int[] c = new int[nC], e = new int[nE];

      for(int i = 0; i < nC; i++) c[i] = sc.nextInt();
      for(int i = 0; i < nE; i++) e[i] = sc.nextInt();

      double cIq = average(c), eIq = average(e);

      int count = 0;
      for(int cs : c)
        if(cs < cIq && cs > eIq) count++;

      System.out.println(count);
    }
    sc.close();
  }

  private static double average(int[] a){
    int val = 0;
    for(int v : a) val += v;

    return (double)val / (double)a.length;
  }
}
