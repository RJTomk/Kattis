// Success in 0.22s
import java.util.Scanner;
import java.util.ArrayList;

public class Fox {
  private static char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); sc.nextLine();
    while (n-- > 0) {
      ArrayList<Character> letters = new ArrayList<>();
      for (char l : alphabet) letters.add(l);
      char[] line = sc.nextLine().toLowerCase().toCharArray();
      for (char c : line) {
        letters.remove((Character)c);
        if (letters.isEmpty()) {
          System.out.println("pangram");
          break;
        }
      }

      if (!letters.isEmpty()){
        String ret = "missing ";
        for (int i = 0; i < letters.size(); i++)
          ret += letters.get(i);
        System.out.println(ret);
      }
    }
    sc.close();
  }
}
