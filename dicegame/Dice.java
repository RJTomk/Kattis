// Success in 0.20s
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Dice{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int a1 = Integer.parseInt(st.nextToken()), b1 = Integer.parseInt(st.nextToken()), a2 = Integer.parseInt(st.nextToken()), b2 = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    int c1 = Integer.parseInt(st.nextToken()), d1 = Integer.parseInt(st.nextToken()), c2 = Integer.parseInt(st.nextToken()), d2 = Integer.parseInt(st.nextToken());

    br.close();

    int[] dice1 = new int[b1 - a1 + 1], dice2 = new int[b2 - a2 + 1], dice3 = new int[d1 - c1 + 1], dice4 = new int[d2 - c2 + 1];

    for(int i = 0; i < dice1.length; i++)
      dice1[i] = a1 + i;
    for(int i = 0; i < dice2.length; i++)
      dice2[i] = a2 + i;
    for(int i = 0; i < dice3.length; i++)
      dice3[i] = c1 + i;
    for(int i = 0; i < dice4.length; i++)
      dice4[i] = c2 + i;

    int emma = 0, gunnar = 0;

    for(int i = 0; i < dice1.length; i++)
      for(int j = 0; j < dice2.length; j++)
        for(int k = 0; k < dice3.length; k++)
          for(int l = 0; l < dice4.length; l++){
            if(dice1[i] + dice2[j] > dice3[k] + dice4[l])
              gunnar++;
            if(dice1[i] + dice2[j] < dice3[k] + dice4[l])
              emma++;
          }

    if(emma > gunnar)
      System.out.println("Emma");
    else if(gunnar > emma)
      System.out.println("Gunnar");
    else
      System.out.println("Tie");
  }
}
