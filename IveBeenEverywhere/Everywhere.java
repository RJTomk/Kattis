import java.util.*;

public class Everywhere{
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int nCase = reader.nextInt();

    for(int i = 0; i < nCase; i++){
      int nVal = reader.nextInt();
      ArrayList<String> visitedCities = new ArrayList<>();

      for(int j = 0; j < nVal; j++){
        String city = reader.next();
        if(!visitedCities.contains(city))
          visitedCities.add(city);
      }

      System.out.println(visitedCities.size());
    }

    reader.close();
  }
}
