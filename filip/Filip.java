// Success in 0.07s
import java.util.Scanner;

public class Filip{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = flipInt(sc.nextInt()), b = flipInt(sc.nextInt());
		sc.close();

		System.out.println(a > b ? a : b);
	}

	private static int flipInt(int val){
		int ret = 0;
		char[] digits = Integer.toString(val).toCharArray();
		for(int i = digits.length - 1; i >= 0; i--){
			ret *= 10;
			ret += (char)((int)digits[i] - (int)'0');
		}

		return ret;
	}
}
