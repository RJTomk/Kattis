// Success in 0.14s

import java.util.Scanner;

public class Numbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int nNumbers = sc.nextInt();
    int num = sc.nextInt(), numI = 1, i = 1;
    boolean allCorrect = true;

    while(numI < nNumbers || num != i) {
      if (num == i) {
        num = sc.nextInt();
        numI++;
      }
      else {
        System.out.println(i);
        allCorrect = false;
      }

      i++;
    }

    if (allCorrect)
      System.out.println("good job");
  }
}
