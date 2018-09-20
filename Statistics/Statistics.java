import java.util.Scanner;

public class Statistics{
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    for(int i = 1; reader.hasNextInt(); i++){
      int n = reader.nextInt();
      int min = 2000000, max = - 2000000;

      for(int j = 0; j < n; j++){
        int val = reader.nextInt();
        if(val < min)
          min = val;
        if(val > max)
          max = val;
      }

      System.out.println("Case " + i + ": " + min + " " + max + " " + (max - min));
    }

    reader.close();
  }
}
