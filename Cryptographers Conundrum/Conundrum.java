// Success in 0.07s
import java.util.Scanner;

public class Conundrum{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String word = reader.next();
		reader.close();

		int count = 0;
		for(int i = 0; i < word.length(); i++){
			if(word.charAt(i) == 'P' && i % 3 == 0)
				continue;
			if(word.charAt(i) == 'E' && i % 3 == 1)
				continue;
			if(word.charAt(i) == 'R' && i % 3 == 2)
				continue;
			count++;
		}

		System.out.println(count);
	}
}
