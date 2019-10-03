// Success in 0.27s

import java.util.Scanner;
import java.util.HashMap;

public class Door {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    HashMap<String, Boolean> map = new HashMap<String, Boolean>();

    while (n-- > 0) {
      if (sc.next().equals("entry")) {
        String name = sc.next();
        boolean isInside = map.getOrDefault(name, false);

        System.out.printf("%s entered%s\n", name, isInside ? " (ANOMALY)" : "");

        map.put(name, true);
      } else {
        String name = sc.next();
        boolean isInside = map.getOrDefault(name, false);

        System.out.printf("%s exited%s\n", name, isInside ? "" : " (ANOMALY)");

        map.put(name, false);
      }
    }

    sc.close();
  }
}
