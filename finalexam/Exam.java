// Success in 0.13s
import java.util.Scanner;

public class Exam{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.nextLine());
      int tot = 0;
      String p = sc.nextLine();

      for(; n > 1; n--){
          String c = sc.nextLine();
          if(p.equals(c)){
            tot++;
          }
          p = c;
      }

      System.out.println(tot);
      sc.close();
  }
}
