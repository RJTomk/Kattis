import java.util.Scanner;

public class Alien{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int i = 0; i < n; i++){
      String alienNumber = sc.next(), sourceLanguage = sc.next(), targetLanguage = sc.next();
      int d = toDecimal(alienNumber, sourceLanguage.toCharArray());

    }
  }

  private static String toNewBase(int d){
    
  }

  private static int toDecimal(String v, char[] lang){
    int ret = 0;
    char[] val = v.toCharArray();
    for(int i = 0; i < val.length; i++){
      ret *= 10;
      for(int j = 0; j < lang.length; j++)
        if(val[i] == lang[j]){
          ret += j * Math.pow(lang.length, val.length - 1 - i);
          break;
        }
    }

    return ret;
  }
}
