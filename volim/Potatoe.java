// Success in 0.14s
import java.util.Scanner;

public class Potatoe{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int player = sc.nextInt();
    int n = sc.nextInt();
    int totTime = 0;

    while(n-- > 0){
      totTime += sc.nextInt();
      if(totTime > 210) break;
      char mark = sc.next().toCharArray()[0];
      if(mark == 'T') player += player == 8 ? -7 : 1;
    }

    System.out.println(player);
  }
}
