// Success in 0.07s
import java.util.Scanner;

public class Mic{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String word = reader.next();
		reader.close();

		for(int i = 0; i < word.length() - 1; i++)
			if(word.charAt(i) == word.charAt(i + 1) && word.charAt(i) == 's'){
				System.out.println("hiss");
				return;
			}

		System.out.println("no hiss");
	}
}
