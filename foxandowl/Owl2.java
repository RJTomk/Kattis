import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Owl2{
  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(InputStreamReader(System.in));

    int n = br.read();

    while(n-- > 0){
      boolean neg
    }
  }

  private static boolean readInp(BufferedReader br, byte[] b){
    char[] s = br.readLine.toCharArray();
    boolean neg = s[0] == '-';
    b = new byte[s.length - (neg ? 1 : 0)];
    for(int i = 0; i < b.length; i++)
      b[i] = (byte)s[neg ? i + 1 : i];

    return neg;
  }
}
