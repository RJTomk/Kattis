import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Hang{ // Passing test 2, when it should fail
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashSet<Character> word = new HashSet<>();
    fillWord(word, sc);
    int right = 0, wrong = 0;
    char[] guess = sc.next().toCharArray();
    sc.close();

    for(char g : guess) {
      if(word.contains(g))
        if(++right == word.size()){
          System.out.println("WIN");
          return;
        }
      else
        if(++wrong == 10) {
          System.out.println("LOSE");
          return;
        }
    }

    System.out.println("LOSE");
  }

  private static void fillWord(Set<Character> word, Scanner sc){
    char[] w = sc.next().toCharArray();
    for(char wc : w)
      word.add(wc);
  }
}
