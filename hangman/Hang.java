// TODO: Handle repeat characters
import java.util.Scanner;
import java.util.HashSet;

public class Hang {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] word = sc.next().toCharArray();
    char[] answer = sc.next().toCharArray();
    sc.close();

    int errors = 0;
    HashSet<Character> letters = new HashSet<Character>();
    HashSet<Character> answers = new HashSet<Character>();
    for(char c : word)
      letters.add(c);

    for(char c : answer){
      if(answers.add(c)){
        if(letters.remove(c))
          if(letters.isEmpty()){
            System.out.println("WIN");
          }
        else
          if(++errors >= 10)
            System.out.println("LOSE");
      }
    }
  }
}
