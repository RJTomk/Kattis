// Success in 0.07s
import java.util.Scanner;

public class Ptice{
  private static final String[] NAMES = { "Adrian", "Bruno", "Goran"};
  private static int aIndex = 0, bIndex = 0, gIndex = 0;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.nextInt();// useless

    String ans = sc.next();
    sc.close();
    int[] score = new int[3];

    for(char c : ans.toCharArray())
      for(int i = 0; i < 3; i++)
        if(c == getNext(i))
          score[i]++;

    int max = Math.max(Math.max(score[0], score[1]), score[2]);
    System.out.println(max);
    for(int i = 0; i < 3; i++)
      if(score[i] == max)
        System.out.println(NAMES[i]);
  }

  private static char getNext(int i){
    switch(i){
      case 0: return aGetNext();
      case 1: return bGetNext();
      case 2: return gGetNext();
    }

    return '\n';
  }

  private static char aGetNext(){
    char ret = aIndex == 0 ? 'A' : aIndex == 1 ? 'B' : 'C';
    aIndex = aIndex == 2 ? 0 : aIndex + 1;
    return ret;
  }

  private static char bGetNext(){
    char ret = bIndex == 1 ? 'A' : bIndex == 3 ? 'C' : 'B';
    bIndex = bIndex == 3 ? 0 : bIndex + 1;
    return ret;
  }

  private static char gGetNext(){
    char ret = gIndex < 2 ? 'C' : gIndex < 4 ? 'A' : 'B';
    gIndex = gIndex == 5 ? 0 : gIndex + 1;
    return ret;
  }
}
