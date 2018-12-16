// Success in 0.07s
import java.util.Scanner;

public class Ping{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int turn = sc.nextInt();
    int p = sc.nextInt();
    int o = sc.nextInt();

    System.out.println(Math.floorDiv((o + p), turn) % 2 == 0 ? "paul" : "opponent");
  }
}
