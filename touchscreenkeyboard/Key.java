import java.util.*;

public class Key{
  private static char[][] keyboard = {
    {'q','w','e','r','t','y','u','i','o','p'},
    {'a','s','d','f','g','h','j','k','l'},
    {'z','x','c','v','b','n','m'}
  };

  public static void main(String[] args) { // TODO: Fix
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while(n-- > 0){
      String word = sc.next();
      int nc = sc.nextInt();

      PriorityQueue<Correct> pq = new PriorityQueue<Correct>(nc);
      while(nc-- > 0){
        String test = sc.next();
        int distance = 0;
        for(int i = 0; i < test.length(); i++){
          int x = 0, y = 0, X = 0, Y = 0;
          find(test.charAt(i), x, y);
          find(word.charAt(i), X, Y);
          distance += Math.abs(x - X) + Math.abs(y - Y);
        }

        pq.add(new Correct(test, distance));
      }

      while(pq.size() != 0) pq.poll();
    }

    sc.close();
  }

  private static void find(char c, int x, int y){
    for(x = 0; x < keyboard.length; x++){
      for(y = 0; y < keyboard[x].length; y++){
        if(c == keyboard[x][y])
          return;
      }
    }
  }
}

class Correct implements Comparable<Correct>{
  protected String s;
  protected int n;
  public Correct(String word, int count){
    s = word;
    n = count;
  }

  public int compareTo(Correct c){
    return Integer.compare(n, c.n);
  }
}
