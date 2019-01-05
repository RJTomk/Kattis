// Success in 0.26s
import java.util.Scanner;

public class Resize{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int
    x = sc.nextInt(),
    y = sc.nextInt(),
    xs = sc.nextInt(),
    ys = sc.nextInt();

    sc.nextLine(); //force line marker to catch up

    for(int i = 0; i < x; i++){
      char[] line = sc.nextLine().toCharArray();
      char[] sLine = new char[line.length * ys];
      for(int j = 0; j < line.length; j++)
        for(int k = 0; k < ys; k++)
          sLine[(j * ys) + k] = line[j];
      for(int j = 0; j < xs; j++)
        System.out.println(toString(sLine));
    }

    sc.close();
  }

  private static String toString(char[] arr){
    String s = "";
    for(char c : arr) s += c;
    return s;
  }
}
