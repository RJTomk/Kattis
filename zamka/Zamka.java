// Success in 0.07s
import java.util.Scanner;

public class Zamka{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int
		min = sc.nextInt(),
		max = sc.nextInt(),
		sum = sc.nextInt();

		for(int i = min; i <= max; i++)
			if(sumDig(i) == sum){
				min = i;
				System.out.println(i);
				break;
			}

		for(int i = max; i >= min; i--)
			if(sumDig(i) == sum){
				max = i;
				System.out.println(i);
				break;
			}
	}

	private static int sumDig(int n){
		int sum = 0;
		while(n > 9){
			sum += n % 10;
			n /= 10;
		}
		return sum + n;
	}
}
