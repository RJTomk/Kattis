// Success in 0.07s
import java.util.Scanner;

public class Quad{
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int x = reader.nextInt();
    int y = reader.nextInt();
    reader.close();

    if(x >= 0){
      if(y >= 0) System.out.println("1");
      else System.out.println("4");
    }else{
      if( y >= 0 ) System.out.println("2");
      else System.out.println("3");
    }
  }
}
