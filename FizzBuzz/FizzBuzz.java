// Success in 0.08s
import java.util.Scanner;

public class FizzBuzz{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int x = reader.nextInt();
		int y = reader.nextInt();
		int n = reader.nextInt();
		reader.close();

		for(int i = 1; i <= n; i++){
			if(i % x == 0)
				System.out.print("Fizz");
			if(i % y == 0)
				System.out.print("Buzz");
			if(i % x != 0 && i % y != 0)
				System.out.print(i);
			System.out.println();
		}
	}
}
