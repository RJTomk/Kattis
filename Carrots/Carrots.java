import java.util.Scanner;

public class Carrots{
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int i = reader.nextInt();
    System.out.println(reader.nextInt());
    for(int j = 0; j < i; j++)
      reader.next();

    reader.close();
  }
}
