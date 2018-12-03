// Success in 0.08s
import java.util.Scanner;

public class Gold{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cash = (3 * sc.nextInt()) + (2 * sc.nextInt()) + (1 * sc.nextInt());
    sc.close();
    String ret = "";

    if(cash >= 2){
      if(cash >= 8) ret += "Province";
      else if(cash >= 5) ret += "Duchy";
      else ret += "Estate";

      ret += " or ";
    }

    if(cash >= 6) ret += "Gold";
    else if(cash >= 3) ret += "Silver";
    else ret += "Copper";

    System.out.println(ret);
  }
}
