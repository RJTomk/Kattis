// Success in 0.07s
import java.util.Scanner;

public class Meese{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int l = reader.nextInt();
		int r = reader.nextInt();
		reader.close();

		if (l == r){
			if(l == 0){
				System.out.println("Not a moose");
				return;
			}
			System.out.println("Even " + (l + r));
		} else {
			System.out.println("Odd " + (Integer.max(l, r) * 2));
		}
	}
}
