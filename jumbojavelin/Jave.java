// Success in 0.11s
import java.util.Scanner;

public class Jave{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int tot = 1 - n;

    for(; n > 0; n--){
      tot += sc.nextInt();
    }
    sc.close();
    
    System.out.println(tot);
  }
}
