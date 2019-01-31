import java.util.*;

public class Sort{ // ODO: Fix someother time
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n;
    while((n = sc.nextInt()) != 0){
      PriorityQueue<String> pq = new PriorityQueue<String>(new StringComparator());
      for(int i = 0; i < n; i++) pq.add(sc.next());
      for(int i = 0; i < n; i++) System.out.println(pq.poll());
    }
    sc.close();
  }

  private static String[] merge(String[] s){
    int n = s.length;
    String[] a = new String[n / 2], b = new String[n - (n / 2)];
    for(int i = 0; i < n; i++){
      if(i < (n / 2))
        a[i] = s[i];
      else
        b[i - (n / 2)] = s[i];
    }

    a =
  }
}
