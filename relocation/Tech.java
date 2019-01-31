import java.util.Scanner;

public class Tech{ // ODO: Takes too long
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int numQuery = sc.nextInt();
    int[] locations = new int[n];

    for(int i = 0; i < n; i++) locations[i] = sc.nextInt();

    while(numQuery-- > 0){
      int x = sc.nextInt();
      int y = sc.nextInt() - 1;
      int z = sc.nextInt();

      if(x == 1) locations[y] = z;
      else System.out.printf("%d\n", Math.abs(locations[y] - locations[z - 1]));
    }

    sc.close();
  }
}
