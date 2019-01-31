// Success in 0.08s
import java.util.Scanner;

public class Roman{
	private static final double RATIO = 5280.0 / 4854.0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(Math.round(sc.nextDouble() * RATIO * 1000));
		sc.close();
	}
}
