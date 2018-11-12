//Success in 0.07s
import java.util.Scanner;

public class Poker{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[][] cards = new char[5][2];
    for(int i = 0; i < 5; i++)
      cards[i] = sc.next().toCharArray();
    sc.close();

    int max = 0;
    for(int i = 0; i < 4; i++){
      int count = 1;
      for(int j = i + 1; j < 5; j++)
        if(cards[i][0] == cards[j][0]) count++;

      max = max > count ? max : count;
    }

    System.out.println(max);
  }
}
