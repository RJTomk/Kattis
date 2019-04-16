import java.util.Scanner;

public class Pig{
  private static char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while(sc.hasNextLine()){
      String[] line = sc.nextLine().split(" ");
      for(int i = 0; i < line.length; i++){
        if(isAVowel(line[i], 0))
          line[i] = String.format("%syay", line[i]);
        else {
          int j = 1;
          while(j < line[i].length() && !isAVowel(line[i], j)) j++;
          String a = line[i].substring(0, j), b = line[i].substring(j);
          line[i] = String.format("%s%say", b, a);
        }
      }

      String fullLine = line[0];
      for(int i = 1; i < line.length; i++)
        fullLine += " " + line[i];

      System.out.println(fullLine);
    }

    sc.close();
  }

  private static boolean isAVowel(String s, int i){
    char c = s.charAt(i);
    for(char v : vowels)
      if(c == v)
        return true;

    return false;
  }
}
