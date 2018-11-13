// Success in 0.07s
import java.util.Scanner;

public class RunLengthEncoding {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String[] input = reader.nextLine().split(" ");
		reader.close();

		switch(input[0].charAt(0)) {
		case 'E':
			Encode(input[1]);
			break;
		case 'D':
			Decode(input[1]);
			break;
		}
	}

	private static void Encode(String word) {
		String res = "";
		int i = 0;
		char repC = word.charAt(0);
		for(char c : word.toCharArray()) {
			if(c != repC) {
				res += repC + Integer.toString(i);
				repC = c;
				i = 1;
			}else {
				i++;
			}
		}
		res += repC + Integer.toString(i);
		System.out.println(res);
	}

	private static void Decode(String code) {
		String res = "";
		for(int i = 1; i < code.length(); i += 2) {
			int n = (int)code.charAt(i) - (int)'1' + 1;
			while(n-- > 0) res += code.charAt(i - 1);
		}

		System.out.println(res);
	}

}
