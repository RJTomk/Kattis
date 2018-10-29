import java.util.Scanner;

public class Sum{ // TODO: Fix, all wrong
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		while(n != 0){
			for(int p = 11; p < 100000; p++)
				if(n == sumDigits(n)){
					System.out.println(p);
					break;
				}

			n = sc.nextInt();
		}

	}

	private static int sumDigits(int num){
		char[] digits = Integer.toString(num).toCharArray();
		int sum = 0;

		for(char c : digits)
			sum += (int)c - (int)'0';

		return sum;
	}
}
