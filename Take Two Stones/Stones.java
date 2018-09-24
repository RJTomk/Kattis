import java.util.Scanner;

public class Stones{
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int stone = reader.nextInt();
    reader.close();

    if(stone % 2 == 1)
      System.out.println("Alice");
    else
      System.out.println("Bob");
  }
}
