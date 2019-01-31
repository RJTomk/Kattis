// Success in 0.09s
import java.util.Scanner;

public class Star{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		System.out.printf("%d:\n", n);
		for(int i = 2; i < n; i++){
			if(n % (2 * i - 1) == 0 || n % (2 * i - 1) == i) System.out.printf("%d,%d\n", i, i - 1);
			if(n % i == 0) System.out.printf("%d,%d\n", i, i);
		}
	}
}
