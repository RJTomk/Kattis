// Success in 0.08s
import java.util.Scanner;

public class Weather{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int count = 0;
		for(int i = 0; i < n; i++) if(reader.nextInt() < 0) count++;

		System.out.println(count);
		reader.close();
	}
}
