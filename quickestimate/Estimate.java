//Success in 0.09s
import java.util.Scanner;

public class Estimate {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();

			while(n-- > 0)
				System.out.println(sc.next().length());

			sc.close();
	}
}
