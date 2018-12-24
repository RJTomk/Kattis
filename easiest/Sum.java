// Success in 0.21s
import java.util.Scanner;

public class Sum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		while(n != 0){
			int sDig = sumDigits(n);
			int i = 11;
			while(sumDigits(i * n) != sDig) i++;
			System.out.println(i);

			n = sc.nextInt();
		}
		sc.close();
	}

	private static int sumDigits(int num){
		int sum = 0;
		while(num > 9){
			sum += num % 10;
			num /= 10;
		}

		return sum + num;
	}
}
