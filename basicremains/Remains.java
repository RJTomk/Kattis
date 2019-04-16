// Success in 0.44s
import java.util.Scanner;
import java.math.BigInteger;

public class Remains{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int b;
    while((b = sc.nextInt()) != 0){
      BigInteger p = new BigInteger(sc.next(), b);
      BigInteger m = new BigInteger(sc.next(), b);

      System.out.println(p.mod(m).toString(b));
    }

    sc.close();
  }
}
