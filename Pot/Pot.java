// Success in 0.07s
import java.util.Scanner;

public class Pot{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt(), result = 0;
		while(n-- > 0){
			int num = reader.nextInt();
			int pow = num % 10;
			int val = Math.floorDiv(num, 10);
			result += pow(val, pow);
		}

		System.out.println(result);
		reader.close();
	}

	private static int pow(int base, int exp){
		int res = 1;
		while(exp-- > 0) res *= base;

		return res;
	}
}
