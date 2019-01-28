// Success in 0.34s
import java.util.Scanner;

public class Hex{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(sc.hasNextLine()){
      char[] line = sc.nextLine().toCharArray();
      boolean good = false;
      String hex = "";
      for(int i = 0; i < line.length; i++){
        if(good){
          if(goodChar(line[i]) && hex.length() < 8){
            hex += line[i];
          }else{
            good = false;
            if(hex.equals("")) continue;
            System.out.printf("0x%s %d\n", hex, Long.parseLong(hex, 16));
            hex = "";
          }
        }else if(Character.toLowerCase(line[i]) == 'x' && i != 0 && line[i - 1] == '0'){
          good = true;
        }
      }

      if(!hex.equals("")){
        System.out.printf("0x%s %d\n", hex, Long.parseLong(hex, 16));
      }
    }

    sc.close();
  }

  private static boolean goodChar(char c){
    return c >= '0' && c <= '9' || c >= 'a' && c <= 'f' || c >= 'A' && c <= 'F';
  }
}
