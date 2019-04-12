import java.util.*;

public class Convo{ // TODO: Understand what the fuck you did you fuckin idiot
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    HashMap<String, HashMap<String, Integer>> users = new HashMap<>();

    while(n-- > 0){
      String[] line = sc.nextLine().split(" ");

      if(users.containsKey(line[0])){
        HashMap<String, Integer> words = users.get(line[0]);

        for(int i = 1; i < line.length; i++){
          words.put(line[i], words.getOrDefault(line[i], 0) + 1);
        }

        users.put(line[0], words);
      }else{
        HashMap<String, Integer> words = new HashMap<>();

        for(int i = 1; i < line.length; i++)
          words.put(line[i], 1);

        users.put(line[0], words);
      }
    }
    sc.close();

    HashMap<String, Integer>[] words = users.values().toArray(new HashMap<String, Integer>[0]);
    Set<String>[] sets = new Set<>[words.length];
    for(int i = 0; i < words.length; i++){
      sets[i] = words[i].keySet();
      if(i > 0)
        sets[i].retainAll(sets[i - 1]);
    }

  }
}
