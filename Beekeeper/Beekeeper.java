import java.util.Scanner;

public class Beekeeper{ // TODO: Figure out why I am always getting wrong answer
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int n = reader.nextInt();
    while(n != 0){
      String longest = "bb";
      for(int i = 0; i < n; i++){
        String word = reader.next();
        if(Count(longest) < Count(word))
          longest = word;
      }

      System.out.println(longest);
      n = reader.nextInt();
    }

    reader.close();
  }

  private static int Count(String word){
    int doubles = 0;
    for(int i = 0; i < word.length() - 1; i++)
      if(word.charAt(i) == word.charAt(i + 1) && IsVowel(word.charAt(i)))
        doubles++;

    return doubles;
  }

  private static boolean IsVowel(char c){
    switch(c){
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
      case 'y':
        return true;
      default:
        return false;
    }
  }
}
