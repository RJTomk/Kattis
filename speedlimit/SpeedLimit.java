// Success in 0.08s
import java.util.*;

public class SpeedLimit{
  public static void main(String[] args) {
      Scanner reader = new Scanner(System.in);

      int n = reader.nextInt();
      while(n != -1){
        int dist = 0;
        int oldTime = 0;
        for(int i = 0; i < n; i++){
          int speed = reader.nextInt();
          int time = reader.nextInt();

          dist += speed * (time - oldTime);
          oldTime = time;
        }
        System.out.println(dist + " miles");
        n = reader.nextInt();
      }

      reader.close();
  }
}
