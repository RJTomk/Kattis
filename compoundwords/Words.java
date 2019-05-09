import java.util.*;

public class Words {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> words = new ArrayList<>();

    while (sc.hasNext())
      words.add(sc.next());
    sc.close();

    HashSet<String> compounds = new HashSet<>();
    for (int i = 0; i < words.size(); i++)
      for (int j = 0; j < words.size(); j++)
        if (i != j)
          compounds.add(words.get(i) + words.get(j));
    for(String s : compounds)
      System.out.println(s);
  }
}
