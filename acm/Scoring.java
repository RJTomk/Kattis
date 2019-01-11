// Success in 0.15s
import java.util.Scanner;

public class Scoring{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int time;
    int[] scores = new int[26];
    int score = 0, numR = 0;
    while((time = sc.nextInt()) != -1){
      char q = sc.next().toCharArray()[0];
      boolean solved = sc.next().equals("right") ? true : false;

      if(solved){
        score += time + scores[q - 'A'];
        numR++;
      } else {
        scores[q - 'A'] += 20;
      }
    }
    sc.close();
    System.out.printf("%d %d\n", numR, score);
  }
}
