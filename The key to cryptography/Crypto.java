import java.util.Scanner;

public class Crypto{ // TODO: Figure out whats up with vowels
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String word = reader.next();
		String key = reader.next();
		reader.close();

		String res = "";
		for(int i = 0; i < word.length(); i++){
			char c = (char)((int)word.charAt(i) - (int)key.charAt(i) + (int)'A');
			key += c;
			res += c;
		}

		System.out.println(res+ " " + key);
	}
}
