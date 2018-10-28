//Success in 0.71s
import java.util.Scanner;

public class Sum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();

		while(p -- > 0){
			int k = sc.nextInt(), n = sc.nextInt();
			int t = (n * (n + 1)) / 2,
			o = (int)Math.pow(n, 2),
			e = (n * (n + 1));

			System.out.printf("%d %d %d %d\n", k, t, o, e);
		}
		sc.close();
	}
}
