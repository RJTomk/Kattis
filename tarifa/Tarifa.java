// Success in 0.08s
import java.util.Scanner;

public class Tarifa{

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int limit = reader.nextInt();
		int n = reader.nextInt();
		int remainder = 0;

		for(int i = 0; i < n; i++) remainder += limit - reader.nextInt();
		System.out.println(remainder + limit);
		reader.close();
	}
}
