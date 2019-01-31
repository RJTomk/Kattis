// Success in 0.28s
import java.util.Scanner;

public class Simon{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); sc.nextLine();
    while(n-- > 0){
      String[] line = sc.nextLine().split(" ");
      if(line.length <= 2) continue;
      if(line[0].equals("Simon") && line[1].equals("says")){
        for(int i = 2; i < line.length; i++)
          System.out.printf("%s%s", line[i], i == line.length - 1 ? "\n" : " ");
      }
    }
    sc.close();
  }
}
