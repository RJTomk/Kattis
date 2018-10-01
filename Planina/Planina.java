// Success in 0.07s
import java.util.Scanner;

public class Planina{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int sideL = 2, n = reader.nextInt();
		reader.close();

		while(n-- > 0) sideL = sideL * 2 - 1;
		System.out.println(sideL * sideL);
	}
}
