import java.util.Scanner;

public class Pig{ //TODO: Fix run-time error on last case
  private static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while(sc.hasNextLine()){
      String[] line = sc.nextLine().split(" ");
      for(int i = 0; i < line.length; i++){
        if(line[i].length() == 0) continue;
        char[] word = line[i].toCharArray();
        if(isVowel(word[0])){
          line[i] += "yay";
        }else{
          int j = 1;
          while(!isVowel(word[j])) j++;
          String w = line[i].substring(j), s = line[i].substring(0, j);
          line[i] = w + s + "ay";
        }
        System.out.printf("%s%s", line[i], i != line.length - 1 ? " " : "");
      }
      System.out.println();
    }

    sc.close();
  }

  private static boolean isVowel(char c){
    for(char v : vowels)
      if(v == c)
        return true;

    return false;
  }
}
