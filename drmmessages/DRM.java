// Success in 0.15s
import java.util.Scanner;

public class DRM{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String word = s.substring(0, s.length() / 2),
    key = s.substring(s.length() / 2);

    sc.close();

    word = rotate(word);
    key = rotate(key);

    System.out.println(merge(word, key));
  }

  private static String rotate(String s){
    int val = 0;
    char[] ch = s.toCharArray();
    for(char c : ch) val += c - 'A';

    for(int i = 0; i < ch.length; i++) ch[i] = rotateChar(ch[i], val);

    return new String(ch);
  }

  private static char rotateChar(char c, int val){
    return (char)('A' + (((c - 'A') + val) % 26));
  }

  private static String merge(String word, String key){
    char[] w = word.toCharArray(), k = key.toCharArray();
    for(int i = 0; i < w.length; i++) w[i] = rotateChar(w[i], k[i] - 'A');
    return new String(w);
  }
}
