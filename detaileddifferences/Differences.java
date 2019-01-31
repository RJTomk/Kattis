// Success in 0.19s
import java.util.Scanner;

public class Differences{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		while(n-- > 0){
			String s1 = sc.next(), s2 = sc.next(), ret = "";
			for(int i = 0; i < s1.length(); i++)
				if(s1.charAt(i) == s2.charAt(i)) ret += ".";
				else ret += "*";

			System.out.printf("%s\n%s\n%s\n\n", s1, s2, ret);
		}

		sc.close();
	}
}
