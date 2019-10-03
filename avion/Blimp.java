// Success in 0.19s
import java.util.Scanner;

public class Blimp {
  public static void main(String[] args) {
    String ret = "";
    Scanner sc = new Scanner(System.in);

    for (int i = 1; i <= 5; i++ ) {
      String name = sc.next();

      if(name.contains("FBI"))
        ret+=String.format("%s%d", ret.equals("") ? "" : " ", i);
    }

    sc.close();
    System.out.println(ret.equals("") ? "HE GOT AWAY!" : ret);
  }
}
