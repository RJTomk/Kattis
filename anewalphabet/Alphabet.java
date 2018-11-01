//Success in 0.28s
import java.util.Scanner;

public class Alphabet{
	public static final String[] NEW_ALPHA = new String[]{
		"@",
		"8",
		"(",
		"|)",
		"3",
		"#",
		"6",
		"[-]",
		"|",
		"_|",
		"|<",
		"1",
		"[]\\/[]",
		"[]\\[]",
		"0",
		"|D",
		"(,)",
		"|Z",
		"$",
		"']['",
		"|_|",
		"\\/",
		"\\/\\/",
		"}{",
		"`/",
		"2"
	};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] chars = sc.nextLine().toLowerCase().toCharArray();
		sc.close();

		String ret = "";

		for(char c : chars){
			if(Character.isLetter(c))
				ret += NEW_ALPHA[c - 'a'];
			else
				ret += c;
		}

		System.out.println(ret);
	}
}
