// Success in 0.07s
import java.util.Scanner;

public class Kemija{
  private static String FixWord(String word){
    word = word.replace("apa", "a");
    word = word.replace("epe", "e");
    word = word.replace("ipi", "i");
    word = word.replace("opo", "o");
    word = word.replace("upu", "u");
    return word;
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String[] words = reader.nextLine().split(" ");
    String result = "";

    for(int i = 0; i < words.length; i++)
      result += FixWord(words[i]) + " ";

    System.out.println(result.trim());
  }

}
