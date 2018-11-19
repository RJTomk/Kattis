// Success in 0.08s
import java.util.Scanner;

public class Goat{
  public static void main(String[] args) {
    Scanner sc    = new Scanner(System.in);
    int x         = sc.nextInt(), y = sc.nextInt();
    int[][] house = new int[2][2];

    for(int i = 0; i < 2; i++)
      for(int j = 0; j < 2; j++)
        house[i][j] = sc.nextInt();

    sc.close();

    if(house[0][0] < x && x < house[1][0]){
      int dist = Math.min(Math.abs(y - house[0][1]), Math.abs(y - house[1][1]));
      System.out.printf("%.1f\n", (double)dist);
    }
    else if(house[0][1] < y && y < house[1][1]){
      int dist = Math.min(Math.abs(x - house[0][0]), Math.abs(x - house[1][0]));
      System.out.printf("%.1f\n", (double)dist);
    }
    else{
      outside(x, y, house);
    }
  }

  private static void outside(int x, int y, int[][] house){
    double min = Double.MAX_VALUE;
    for(int i = 0; i < 2; i++)
    for(int j = 0; j < 2; j++){
      int xDiff   = Math.abs(x - house[i][0]);
      int yDiff   = Math.abs(y - house[j][1]);
      double dist = Math.sqrt((xDiff * xDiff) + (yDiff * yDiff));
      min         = dist < min ? dist : min;
    }

    System.out.printf("%.1f\n",min);
  }
}
