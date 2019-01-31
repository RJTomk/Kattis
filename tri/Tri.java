// Success in 0.07s
import java.util.Scanner;

public class Tri{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int
		a = sc.nextInt(),
		b = sc.nextInt(),
		c = sc.nextInt();

		sc.close();

		if(a + b == c) System.out.printf("%d+%d=%d", a, b, c);
		else if(a - b == c) System.out.printf("%d-%d=%d", a, b, c);
		else if(a * b == c) System.out.printf("%d*%d=%d", a, b, c);
		else if(a / b == c) System.out.printf("%d/%d=%d", a, b, c);
		else if(a == b + c) System.out.printf("%d=%d+%d", a, b, c);
		else if(a == b - c) System.out.printf("%d=%d-%d", a, b, c);
		else if(a == b * c) System.out.printf("%d=%d*%d", a, b, c);
		else if(a == b / c) System.out.printf("%d=%d/%d", a, b, c);
	}
}
