import java.io.*;
import java.util.StringTokenizer;

public class NonPrime{
  public static void main(String[] args) throws IOException{
    QuickReader qr = new QuickReader();
    int n = qr.nextInt();

    while(n-- > 0){
      int v = qr.nextInt(), count = 0;

      if(v <= 2){
        System.out.println(0);
        continue;
      }

      System.out.printf("___\n%d\n", v);
      for(int i = 2; i < v; i++)
        if(v % i == 0 && !isPrime(i)) {
          count++;
          System.out.println(i);
        }

      System.out.println(count);
    }

    qr.close();
  }

  private static boolean isPrime(int n){
    if(n == 2)
      return true;
    else if(n % 2 == 0)
      return false;

    double sq = Math.sqrt(n);
    for(int i = 3; i < sq; i += 2)
      if(n % i == 0)
        return false;

    return true;
  }
}

class QuickReader{
  private BufferedReader br;
  private StringTokenizer st;

  public QuickReader(){
    br = new BufferedReader(new InputStreamReader(System.in));
  }

  String next(){
    while(st == null || !st.hasMoreElements()){
      try{
        st = new StringTokenizer(br.readLine());
      }catch(IOException e){
        e.printStackTrace();
      }
    }

    return st.nextToken();
  }

  public int nextInt(){
    return Integer.parseInt(next());
  }

  public void close() throws IOException{
    br.close();
  }
}
