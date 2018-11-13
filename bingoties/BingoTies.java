import java.util.Arrays;
import java.util.Scanner;
public class BingoTies {

	public static void main(String[] args) { // TODO: Fix
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int[][][] cards = new int[n][5][5];
		for(int i = 0; i < n; i++)
			for(int j = 0; j < 5; j++) {
				for(int k = 0; k < 5; k++)
					cards[i][j][k] = reader.nextInt();

				Arrays.sort(cards[i][j]);
			}
		reader.close();

		int a = 0,b = 0;
		int max = 0;
		for(int i = 0; i < n - 1; i++)
			for(int j = i + 1; j < n; j++) {
				int match = maxMatches(cards, i, j);
				if(max < match) {
					a   = i;
					b   = j;
					max = match;
				}
			}

		if(max == 0)
			System.out.println("no ties");
		else
			System.out.printf("%d %d", a + 1, b + 1);

	}

	private static int maxMatches(int[][][] cards, int i, int j) {
		int max = 0;

		for(int k = 0; k < 5; k++) { // i card row
			for(int l = 0; l < 5; l++) { // j card row
				int val = 0;
				for(int m = 0; m < 5; m++)
					if(Arrays.binarySearch(cards[j][l], cards[i][k][m]) >= 0)
						val++;

				max = val > max ? val : max;
			}
		}

		return max;
	}

}
