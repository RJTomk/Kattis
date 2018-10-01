// Success in 0.07s
import java.util.Scanner;

public class Autori {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String[] line = reader.nextLine().split("-");
		String res = "";
		for(String word : line) res += word.charAt(0);
		System.out.println(res);
	}
}
