import java.util.Scanner;

public class Owl{ // TODO: Get software engeneering degree
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 1 /*sc.nextInt()*/;

    while(n-- > 0){
      long v = -1 * (long)Math.pow(10, 100000) /*sc.nextLong()*/;
      long val = sumOfDigits((long)Math.abs(v));

      long i = v;
      while(sumOfDigits((long)Math.abs(--i)) != val + 1)
        if(i == 0)
          i = v * -1;

      System.out.println(i);
    }
    sc.close();
  }

  private static long sumOfDigits(long a){
    return a <= 9 ? a : a % 10 + sumOfDigits(a / 10);
  }

  // private static long sumOfDigits(long a){
  //   if(a < 0)
  //     a *= -1;
  //
  //   long sum = 0;
  //   while(a > 9){
  //     sum += a % 10;
  //     a /= 10;
  //   }
  //
  //   return sum + a;
  // }
}
