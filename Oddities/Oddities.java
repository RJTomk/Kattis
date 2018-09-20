import java.util.*;

public class Oddities{
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int n = reader.nextInt();

    for(int i = 0; i < n; i++){
      int x = reader.nextInt();

      if(x % 2 == 0)
        System.out.println(x + " is even");
      else
        System.out.println(x + " is odd");
    }

    reader.close();
  }
}
