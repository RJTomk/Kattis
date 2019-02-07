// Success in 0.15s
import java.util.Scanner;

public class Mario{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean[] obs = new boolean[sc.nextInt()];
    int n = sc.nextInt();

    while(n -- > 0)
      obs[sc.nextInt()] = true;
    sc.close();

    int count = 0;
    for(int i = 0; i < obs.length; i++){
      if(obs[i])
        count++;
      else
        System.out.println(i);
    }

    System.out.printf("Mario got %d of the dangerous obstacles.\n", count);
  }
}
