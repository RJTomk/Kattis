// Success in 0.08s
import java.util.Scanner;

public class Herman{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		sc.close();

		System.out.printf("%.6f\n%.6f\n", r * r * Math.PI, r * r * 2.0);
	}
}
