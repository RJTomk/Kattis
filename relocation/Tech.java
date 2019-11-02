// Success in 0.61s
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Tech{
  public static void main(String[] args) throws IOException {
    // Scanner sc = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    // String[] line = br.readLine().split(" ");
    int n = Integer.parseInt(st.nextToken());
    int numQuery = Integer.parseInt(st.nextToken());

    int[] locations = new int[n];
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < n; i++) locations[i] = Integer.parseInt(st.nextToken());

    while(numQuery-- > 0){
      // line = br.readLine().split(" ");
      st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken()) - 1;
      int z = Integer.parseInt(st.nextToken());

      if(x == 1) locations[y] = z;
      else System.out.println(Math.abs(locations[y] - locations[z - 1]));
    }

    br.close();
  }
}
