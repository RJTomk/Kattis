// Success in 0.08s
import java.util.Scanner;

public class Ladder{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println((int)Math.ceil(reader.nextDouble() / Math.sin(Math.toRadians(reader.nextDouble()))));
		reader.close();
	}
}
