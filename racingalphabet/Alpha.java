// Success for 0.14s
import java.util.Scanner;

public class Alpha{
  private static double tileDist = (Math.PI * 60) / 28;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt(); sc.nextLine();
    while(n-- > 0){
      char[] arr = sc.nextLine().toCharArray();
      double t = arr.length;
      int nTiles = 0;

      for(int i = 0; i < arr.length - 1; i++)
        nTiles += numTile(arr[i], arr[i + 1]);

      t += nTiles * tileDist / 15;

      System.out.println(t);
    }

    sc.close();
  }
  private static int numTile(char s, char e){
    int f = Math.abs(pos(s) - pos(e)) % 28;
    int b = 28 - f;

    return Math.min(f, b);
  }

  private static int pos(char c){
    return (c == ' ') ? 26 : (c == '\'') ? 27 : c - 'A';
  }
}
