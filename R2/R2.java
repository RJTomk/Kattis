// R2 0.07s
import java.util.Scanner;

public class R2{
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int a = reader.nextInt();
    int c = reader.nextInt();
    reader.close();

    System.out.println((2 * c) - a);
  }
}
