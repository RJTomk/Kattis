// Success in 0.08s
import java.util.Scanner;

public class Magic{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		reader.close();

		for(int i = 1; i <= n; i++) System.out.printf("%d Abracadabra\n", i);
	}
}
