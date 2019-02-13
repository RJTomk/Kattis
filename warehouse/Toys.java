// Success in 0.40s
import java.util.*;

public class Toys{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nCase = sc.nextInt();

    while(nCase-- > 0){
      int n = sc.nextInt();
      HashMap<String, Integer> map = new HashMap<String, Integer>();

      while(n-- > 0){
        String name = sc.next();
        int count = sc.nextInt();

        map.put(name, map.getOrDefault(name, 0) + count);
      }

      String[] keys;
      {
        Object[] keyObjects = map.keySet().toArray();
        keys = Arrays.copyOf(keyObjects, keyObjects.length, String[].class);
      }

      Toy[] allToys = new Toy[keys.length];
      for(int i = 0; i < keys.length; i++)
        allToys[i] = new Toy(keys[i], map.get(keys[i]));

      Arrays.sort(allToys);

      System.out.println(allToys.length);
      for(Toy t : allToys)
        System.out.printf("%s %d\n", t.name, t.count);
    }

    sc.close();
  }
}

class Toy implements Comparable<Toy>{
  public String name;
  public int count;

  public Toy(String name, int count){
    this.name = name;
    this.count = count;
  }

  public int compareTo(Toy otherToy){
    return count == otherToy.count ? name.compareTo(otherToy.name) : otherToy.count - count;
  }
}
