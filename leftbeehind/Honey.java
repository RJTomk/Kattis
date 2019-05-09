// Success in 0.14s
import java.util.Scanner;

public class Honey {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while(true) {
      int sweet = sc.nextInt(),
      sour = sc.nextInt();

      if(sweet == 0 && sour == 0)
        break;

      if (sweet + sour == 13) {
        System.out.println("Never speak again.");
      } else if (sweet == sour)
        System.out.println("Undecided.");
      else if (sweet > sour)
        System.out.println("To the convention.");
      else
        System.out.println("Left beehind.");

      sweet = 0;
      sour = 0;
    }
    sc.close();
  }
}
