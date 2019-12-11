// Clean up

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.itil.ArrayList;

public class Bacon {
  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    HashMap<String, ArrayList> map = new HashMap<>();

    while(n != 0) {
      for(int i = 0; i < n; i++) {
        String[] line = br.readLine().split(" ");
        String name = line[0];

        for(int j = 1; j < line.length; j++) {
          if(map.containsKey(line[j])) {
            map.put(line[j], map.get(line[j]).add(name));
          } else {
            ArrayList<String> al = new ArrayList<>();
            al.add(name);
            map.put(line[j], al);
          }
        }
      }



      n = Integer.parseInt(br.readLine());
    }
  }
}
