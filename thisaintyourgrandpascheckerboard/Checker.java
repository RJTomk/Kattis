import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Checker {
  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    char[][] board = new char[n][n];

    for(int i = 0; i < n; i++) {
      String line = br.readLine();

      for(int j = 0; j < n; j++)
        board[i][j] = line.charAt(j);
    }

    for(int i = 0; i < n; i++) {
      int wh = 0, bh = 0, bv = 0, wv = 0, sameCountH = 0, sameCountV = 0;
      char lastValH = 'T', lastValV = 'T';
      boolean isBoard = true;

      for(int j = 0; j < n; j++) {
        // Horizontal
        char c = board[i][j];
        if(c == 'W') wh++;
        else bh++;

        if(c == lastValH){
          sameCountH++;
          if(sameCountH >= 2) {
            isBoard = false;
            break;
          }
        }
        else {
          lastValH = c;
          sameCountH = 0;
        }

        // Vertical
        c = board[j][i];
        if(c == 'W') wv++;
        else bv++;

        if(c == lastValV){
          sameCountV++;
          if(sameCountV >= 2){
            isBoard = false;
            break;
          }
        }
        else {
          lastValV = c;
          sameCountV = 0;
        }
      }
    }
  }
}
