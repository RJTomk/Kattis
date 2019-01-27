import java.util.Scanner;

public class Try{
  public static void main(String[] args) { //TODO: Figure out what is going on with test 2
    Scanner sc = new Scanner(System.in);
    char[] A = sc.next().toCharArray(), B = sc.next().toCharArray();
    int x = 0, y = 0, m = Math.min(A.length, B.length);
    boolean X = true, Y = true;

    for(int i = 0; i < m; i++){
      int a = convert(A[i]), b = convert(B[i]);
      if(a >= b){
        x *= 10;
        x += a;
        X = false;
      }
      if(b >= a){
        y *= 10;
        y += b;
        Y = false;
      }
    }
    m--;
    while(m >= A.length){
      x *= 10;
      x += convert(A[m]);
      m++;
    }
    while(m >= B.length){
      y *= 10;
      y += convert(B[m]);
      m++;
    }

    sc.close();
    if(X)
      System.out.println("YODA");
    else
      System.out.println(x);

    if(Y)
      System.out.println("YODA");
    else
      System.out.println(y);
  }

  private static int convert(char c){
    return c - '0';
  }
}
