// Success in 0.10s
import java.util.Scanner;

public class ToLower{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int p = reader.nextInt();
		int r = reader.nextInt();
		int succ = 0;

		for(int i = 0; i < p; i++){
			String[] words = new String[r];
			for(int j = 0; j < r; j++)
				words[j] = reader.next();

			succ += allLower(words) ? 1 : 0;
		}

		reader.close();
		System.out.println(succ);
	}

	private static boolean allLower(String[] words){
		for(String word : words)
			for(int i = 1; i < word.length(); i++)
				if(word.charAt(i) < 'a' || 'z' < word.charAt(i))
					return false;

		return true;
	}
}
