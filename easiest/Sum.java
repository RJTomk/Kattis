import java.util.Scanner;

public class Sum{ // TODO: Fix, got wrong answer somehow
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		while(n != 0){
			int sDig = sumDigits(n);
			if(sDig % 3 == 0){
				int i = 11;
				while(i % 3 == 0 || sumDigits(i * n) != sDig) i++;
				System.out.println(i);

				// for(int i = 11; i <= 100; i++){
				// 	if(i % 3 == 0) continue;
				// 	if(sumDigits(i * n) == sDig){
				// 		System.out.println(i);
				// 		break;
				// 	}
				// }
			}
			else{
				int i = 11;
				while(sumDigits(i * n) != sDig) i++;
				System.out.println(i);
			}

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
