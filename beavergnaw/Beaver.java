import java.util.Scanner;

public class Beaver{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int D = sc.nextInt();
    int V = sc.nextInt();
    sc.close();

    System.out.println(Math.cbrt(Math.pow(D, 3) - (V / Math.PI)));
  }
}
