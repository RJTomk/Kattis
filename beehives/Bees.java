// Success in 0.21s
import java.util.Scanner;

public class Bees{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double maxDist;
    int n;

    while((maxDist = sc.nextDouble()) != 0 && (n = sc.nextInt()) != 0){
      double[][] hives = new double[n][2];
      for(int i = 0; i < n; i++){
        hives[i][0] = sc.nextDouble();
        hives[i][1] = sc.nextDouble();
      }

      int sour = 0;

      for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
          if(i == j) continue;

          if(distance(hives[i], hives[j]) <= maxDist){
            sour += 1;
            break;
          }
        }
      }

      System.out.printf("%d sour, %d sweet\n", sour, n - sour);
    }
  }

  private static double distance(double[] a, double[] b){
    double x = a[0] - b[0], y = a[1] - b[1];

    return Math.sqrt((x*x) + (y*y));
  }
}
