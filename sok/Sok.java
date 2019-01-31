// Success in 0.08s
import java.util.Scanner;

public class Sok{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] juices = new int[]{
			sc.nextInt(),
			sc.nextInt(),
			sc.nextInt()
		};

		int[] recipe = new int[]{
			sc.nextInt(),
			sc.nextInt(),
			sc.nextInt()
		};
		sc.close();

		double amount = 50000.0;

		for(int i = 0; i < 3; i++)
			if((double)juices[i] / (double)recipe[i] < amount)
				amount = (double)juices[i] / (double)recipe[i];

		System.out.printf("%.6f %.6f %.6f", juices[0] - (recipe[0] * amount),
		juices[1] - (recipe[1] * amount),
		juices[2] - (recipe[2] * amount));
	}
}
