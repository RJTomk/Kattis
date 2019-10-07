// Success in 0.14s
import java.util.Scanner;

public class Hike {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] temps = new int[n];

    for(int i = 0; i < n; i++)
      temps[i] = sc.nextInt();

    int lI = 0, lTemp = maxAll(temps);

    for(int i = 0; i < n - 2; i++) {
      int m = max(temps[i], temps[i + 2]);
      if (m < lTemp) {
        lTemp = m;
        lI = i;
      }
    }

    System.out.printf("%d %d\n", lI + 1, lTemp);
  }

  private static int maxAll(int[] arr) {
    int maxi = arr[0];
    for (int i = 0; i < arr.length; i++)
      maxi = max(arr[i], maxi);

    return maxi;
  }

  private static int max(int a, int b) {
    return a > b ? a : b;
  }
}
