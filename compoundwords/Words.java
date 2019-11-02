// TODO: Wrong answers

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Words{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = "";
    ArrayList<String> words = new ArrayList<>();
    while((line = br.readLine()) != null){
      System.out.println(line);
      StringTokenizer st = new StringTokenizer(line);
      while(st.hasMoreTokens())
        words.add(st.nextToken());
    }

    br.close();

    for(int i = 0; i < words.size(); i++)
      for(int j = 0; j < words.size(); j++){
        if(i == j) continue;

        System.out.println(words.get(i) + words.get(j));
      }
  }
}
