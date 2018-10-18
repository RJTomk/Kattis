// Success in 0.07s
import java.util.Scanner;

public class Railroad{
		public static void main(String[] args) {
			Scanner reader = new Scanner(System.in);
			reader.nextInt();
			System.out.println(reader.nextInt() % 2 == 0 ? "possible" : "impossible");
			reader.close();
		}
}
