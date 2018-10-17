// Success in 0.12s
import java.util.Scanner;

public class Parking{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();

		while(n-- > 0){
			int nR = reader.nextInt();
			int min = 100, max = 0;
			while(nR -- > 0){
				int val = reader.nextInt();
				min = Math.min(min, val);
				max = Math.max(max, val);
			}

			System.out.println((max - min) * 2);
		}

		reader.close();
	}
}
