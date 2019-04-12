import java.util.Scanner;

public class Fox{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    while(n-- > 0){
      int v = sc.nextInt();
      int val = sumOfDigits(v);

      for(int i = v - 1; i >= 0; i--){
        int s = sumOfDigits(i);
        if(s + 1 == val){
          System.out.println(i);
          break;
        }
      }
    }

    sc.close();
  }

  private static int sumOfDigits(int a){
    int sum = 0;
    while(a > 9){
      sum += a % 10;
      a = (a - (a % 10)) / 10;
    }
    return sum + a;
  }
}
