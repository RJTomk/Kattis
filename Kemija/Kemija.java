import java.util.*;

public class Kemija{ // Gets wrong answer
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String result = "";

    while(reader.hasNext()){
      String word = reader.next();
      String newWord = "" + word.charAt(0);

      int i = 1;
      while(i < word.length()){
        if(word.charAt(i) == 'p' && IsVowel(word.charAt(i - 1)) && word.charAt(i - 1) == word.charAt(i + 1)){
          i++;
        }else{
          newWord = newWord + word.charAt(i);
        }

        i++;
      }

      result = result + newWord + " ";
    }
    System.out.println(result.trim());
    reader.close();
  }

  private static boolean IsVowel(char c){
    switch(c){
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
        return true;
      default:
        return false;
    }
  }
}
