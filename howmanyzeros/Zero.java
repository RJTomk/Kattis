import java.util.Scanner;

public class Zero{ // TODO: Wayyyyy too slow
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x, y;
    while((x = sc.nextLong()) >= 0 && (y = sc.nextLong()) >= 0){
      int count = 0;
      for(long i = x; i <= y; i++)
        count += countZeroes(i);

      System.out.println(count);
    }

    sc.close();
  }

  private static long countZeroes(long i){
    long c = 0;
    while(i > 9){
      if(i % 10 == 0)
        c++;
      i /= 10;
    }
    c += i == 0 ? i : 0;
    return c;
  }
}
