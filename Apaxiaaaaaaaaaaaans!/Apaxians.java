// Success in 0.08s
import java.util.*;

public class Apaxians{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<Character> word = new ArrayList<Character>();
		String input = reader.next();
		for(char c : input.toCharArray()) word.add(c);
		reader.close();

		for(int i = 1; i < word.size(); i++)
			if(word.get(i) == word.get(i - 1)){
				word.remove(i);
				i--;
			}

		String output = "";
		for(int i = 0; i < word.size(); i++) output += word.get(i);

		System.out.println(output);
	}
}
