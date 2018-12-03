import java.util.Scanner;

public class Harshad{
  public static void main(String[] args) { // TODO: Fix random wrong answer, can't figure out why
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();

    if(n == 0) {
      System.out.println(0);
      return;
    }

    while(n % sumOfDigits(n) != 0) n++;

    System.out.println(n);
  }

  private static int sumOfDigits(int n){
    int ret = 0;
    while(n > 9){
      ret += n / 10;
      n %= 10;
    }

    return ret + n;
  }
}
