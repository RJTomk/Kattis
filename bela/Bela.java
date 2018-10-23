// Success in 0.08s
import java.util.Scanner;

public class Bela{
	private static final int[] DOMINANTVALUES = {0, 0, 14, 10, 20, 3, 4, 11};
	private static final int[] NORMALVALUES   = {0, 0, 0, 10, 2, 3, 4, 11} ;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		char dom = reader.next().toCharArray()[0];

		int score = 0;
		for(int i = 0; i < n * 4; i++){
			char[] card = reader.next().toCharArray();

			score += card[1] == dom ? DOMINANTVALUES[getCardIndex(card[0])] : NORMALVALUES[getCardIndex(card[0])];
		}
		reader.close();
		System.out.println(score);
	}

	private static int getCardIndex(char c){
		switch(c){
			case '7': return 0;
			case '8': return 1;
			case '9': return 2;
			case 'T': return 3;
			case 'J': return 4;
			case 'Q': return 5;
			case 'K': return 6;
			case 'A': return 7;
			default: return -1;
		}
	}
}
