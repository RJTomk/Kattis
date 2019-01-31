// Success in 0.07s
import java.util.Scanner;

public class Chicken{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int diff   = (sc.nextInt() - sc.nextInt()) * -1;
		sc.close();

		if(diff < 0)
			System.out.printf("Dr. Chaz needs %d more %s of chicken!", diff * (-1), diff == -1 ? "piece" : "pieces");
		else
			System.out.printf("Dr. Chaz will have %d %s of chicken left over!", diff, diff == 1 ? "piece" : "pieces");
	}
}
