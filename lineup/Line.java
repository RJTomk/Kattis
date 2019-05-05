// Success in 0.14s
import java.util.Scanner;

public class Line{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt() - 1;
    boolean isIncreasing = true;
    boolean isDecreasing = true;
    String name1 = sc.next(), name2;
    while (n-- > 0 && (isIncreasing || isDecreasing)){
      name2 = sc.next();
      if (name1.compareTo(name2) > 0)
        isIncreasing = false;
      else if (name1.compareTo(name2) < 0)
        isDecreasing = false;
      name1 = name2;
    }
    sc.close();

    if(isIncreasing)
      System.out.println("INCREASING");
    else if(isDecreasing)
      System.out.println("DECREASING");
    else
      System.out.println("NEITHER");
  }
}
