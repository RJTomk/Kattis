// Success in 0.65
import java.util.Scanner;

public class Decode {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n      = sc.nextInt();

    while(n-- > 0){
      char[] line    = sc.next().toCharArray();
      int sideLength = (int)Math.sqrt(line.length);

      for(int i = sideLength - 1; i >=0; i--)
      for(int j = i; j < line.length; j += sideLength)
        System.out.print(line[j]);
      System.out.println();
    }

    sc.close();
  }
}
