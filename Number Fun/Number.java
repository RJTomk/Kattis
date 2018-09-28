// Success in 0.34s
import java.util.Scanner;

public class Number{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		for(int i = 0; i < n; i++){
			int a = reader.nextInt();
			int b = reader.nextInt();
			int c = reader.nextInt();

			if(a + b == c || a - b == c || b - a == c || a * b == c || (double)a / (double)b == c || (double)b / (double)a == c)
				System.out.println("Possible");
			else
				System.out.println("Impossible");
		}

		reader.close();
	}
}
