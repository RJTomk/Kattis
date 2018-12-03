import java.util.Scanner;

public class Rot{ // TODO: Fix
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    while(n != 0){
      char[] word = rotateString(sc.next()).toCharArray();

      for(int i = 0; i < word.length; i++)
        word[i] = rotateChar(word[i], n);

      System.out.println(word.toString());
      n = sc.nextInt();
    }

    sc.close();
  }

  private static String rotateString(String s){
    if(s.length() <= 1) return s;

    return s.charAt(s.length() - 1) + rotateString(s.substring(1, s.length() - 1)) + s.charAt(0);
  }

  private static char rotateChar(char c, int n){
    int C = c + n;

    if(C > 'Z' + 2)
      return (char)(C - 28);
    if(C == 'Z' + 2)
      return '.';
    if(C == 'Z' + 1)
      return '_';
    return (char)C;
  }
}
