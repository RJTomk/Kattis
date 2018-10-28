// Success in 0.07s
import java.util.Scanner;

public class Crypto{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String word = reader.next();
		String key = reader.next();
		reader.close();

		String res = "";
		for(int i = 0; i < word.length(); i++){
			char c = charSubtract(word.charAt(i), key.charAt(i)); //(char)((int)word.charAt(i) - (int)key.charAt(i) + (int)'A');
			key += c;
			res += c;
		}

		System.out.println(res);
	}

	private static char charSubtract(char c, char k){
		int cI = c;
		int kI = k;
		int s = (cI - kI + 26) % 26 + 65;
		return (char)s;
	}
}
