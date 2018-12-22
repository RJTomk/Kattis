// Success in 0.55s
import java.util.Scanner;

public class Distance{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float x1;
    while((x1 = sc.nextFloat()) != 0f){
      float
      y1 = sc.nextFloat(),
      x2 = sc.nextFloat(),
      y2 = sc.nextFloat(),
      p  = sc.nextFloat();

      System.out.printf("%.10f\n", Math.pow(Math.pow(Math.abs(x1 - x2),p) + Math.pow(Math.abs(y1 - y2),p),1F / p));
    }
  }
}
