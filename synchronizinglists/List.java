// Success in 0.69s
import java.util.*;

public class List{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while(n != 0){
      int[] xArr = new int[n];
      for(int i = 0; i < n; i++)
        xArr[i] = sc.nextInt();
      Pair[] pairs = setSortedPair(xArr);
      PriorityQueue<Integer> yArr = new PriorityQueue<Integer>();
      for(int i = 0; i < n; i++)
        yArr.add(sc.nextInt());

      for(int i = 0; i < n; i++)
        pairs[i].b = yArr.poll();

      for(int x : xArr)
        for(Pair p : pairs)
          if(p.a == x){
            System.out.println(p.b);
            break;
          }

      if((n = sc.nextInt()) != 0)
        System.out.println();
    }

    sc.close();
  }

  private static Pair[] setSortedPair(int[] xArr){
    int[] arr = new int[xArr.length];
    System.arraycopy(xArr, 0, arr, 0, xArr.length);
    Arrays.sort(arr);

    Pair[] pairs = new Pair[arr.length];
    for(int i = 0; i < arr.length; i++)
      pairs[i] = new Pair(arr[i]);

    return pairs;
  }
}

class Pair{
  public int a, b;

  public Pair(int x){
    a = x;
  }
}
