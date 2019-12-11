// Success in 0.08s
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Checker {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    char[][] board = new char[n][n];
    for(int i = 0; i < n; i++)
      board[i] = br.readLine().toCharArray();

    boolean isBoard = true;
    for(int i = 0; i < n; i++) {
      int wh = 0, bh = 0, wv = 0, bv = 0, hStreak = 0, vStreak = 0;
      char vStreakChar = 'd', hStreakChar = 'd';

      for(int j = 0; j < n; j++) {
        // Horizontal
        char c = board[i][j];
        if(c == 'W') {
          wh++;

          if(c == hStreakChar) {
            hStreak++;

            if(hStreak >= 2) {
              isBoard = false;
              break;
            }
          } else {
            hStreakChar = c;
            hStreak = 0;
          }
        } else {
          bh++;

          if(c == hStreakChar) {
            hStreak++;

            if(hStreak >= 2) {
              isBoard = false;
              break;
            }
          } else {
            hStreakChar = c;
            hStreak = 0;
          }
        }

        // Vertical
        c = board[j][i];
        if(c == 'W') {
          wv++;

          if(c == vStreakChar) {
            vStreak++;

            if(vStreak >= 2) {
              isBoard = false;
              break;
            }
          } else {
            vStreakChar = c;
            vStreak = 0;
          }
        } else {
          bv++;

          if(c == vStreakChar) {
            vStreak++;

            if(vStreak >= 2) {
              isBoard = false;
              break;
            }
          } else {
            vStreakChar = c;
            vStreak = 0;
          }
        }
      }

      if(!isBoard || wh != bh || wv != bv) {
        System.out.println("0");
        isBoard = false;
        break;
      }
    }

    if(isBoard)
      System.out.println("1");
  }
}
