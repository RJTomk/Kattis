// Success in 0.08s

import java.util.Scanner;

public class ARealChallenge{
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    long area = reader.nextLong();
    reader.close();

    System.out.println(sideLength * 4);
    double sideLength = Math.sqrt(area);
  }
}
