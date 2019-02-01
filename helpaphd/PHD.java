// Success in 0.20s
import java.util.Scanner;

public class PHD{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while(n-- > 0){
      String line = sc.next();
      if(line.equals("P=NP")){
        System.out.println("skipped");
        continue;
      }

      int a = 0, b = 0;
      boolean first = true;
      for(char c : line.toCharArray()){
        if(c == '+'){
          first = false;
        }else if(first){
          a *= 10;
          a += c - '0';
        }else{
          b *= 10;
          b += c - '0';
        }
      }

      System.out.println(a + b);
    }
    sc.close();
  }
}
