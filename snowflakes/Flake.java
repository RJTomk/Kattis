import java.util.*;

public class Flake{ // TODO: Fix over max time
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nCount = sc.nextInt();

    while(nCount-- > 0){
      int n = sc.nextInt();
      int[] flakes = new int[n];

      int longest = 0, startIndex = 0;
      for(int i = 0; i < n; i++){
        flakes[i] = sc.nextInt();
        for(int j = startIndex; j < i; j++){
          if(flakes[i] == flakes[j]){
            longest = Math.max(longest, j - startIndex);
            startIndex = j + 1;
          }
        }
      }

      System.out.println(Math.max(longest, n - startIndex));
    }

    sc.close();
  }
}
