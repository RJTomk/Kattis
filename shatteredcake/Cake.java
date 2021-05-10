// Success in 3.77s
import java.util.Scanner;

public class Cake{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int totw = sc.nextInt();
    int n = sc.nextInt();
    int a = 0;
    for(; n > 0; n--){
      int w = sc.nextInt();
      int l = sc.nextInt();
      a += w * l;
    }
    sc.close();
    
    System.out.println(a / totw);
  }
}
