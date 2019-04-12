// Success in 0.14s
import java.util.Scanner;

public class Server{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(), maxTime = sc.nextInt(), time = 0, count = 0;

    while((n-- > 0) && ((time += sc.nextInt()) <= maxTime))
      count++;

    sc.close();
    System.out.println(count);
  }
}
