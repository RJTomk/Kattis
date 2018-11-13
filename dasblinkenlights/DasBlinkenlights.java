// Success in 0.07s
import java.util.Scanner;

public class DasBlinkenlights {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int p = reader.nextInt();
		int q = reader.nextInt();
		int s = reader.nextInt();
		reader.close();

		for(int i = 1; i <= s; i++)
			if(i % p == 0 && i % q == 0) {
				System.out.println("yes");
				return;
			}

		System.out.println("no");

	}

}
