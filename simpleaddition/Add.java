// Success in 0.23s
import java.util.Scanner;
import java.math.BigInteger;

public class Add{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BigInteger a = new BigInteger(sc.next());
    BigInteger b = new BigInteger(sc.next());
    sc.close();
    System.out.println(a.add(b));
  }
}
