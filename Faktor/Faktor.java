// Success in 0.07s
import java.util.Scanner;

public class Faktor{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.printf("%d\n", reader.nextInt() * (reader.nextInt() - 1) + 1);
		reader.close();
	}
}
