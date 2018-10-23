// Success in 0.08s
import java.util.Scanner;

public class Cetvrta{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int[] x = new int[3], y = new int[3];
		for(int i = 0; i < 3; i++){
			x[i] = reader.nextInt();
			y[i] = reader.nextInt();
		}
		reader.close();

		System.out.printf("%d %d", returnUnused(x), returnUnused(y));
	}

	private static int returnUnused(int[] arr){
		return arr[0] == arr[1] ? arr[2] : arr[1] == arr[2] ? arr[0] : arr[1];
	}
}
