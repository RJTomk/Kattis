// Success in 0.07s
import java.util.Scanner;

public class Spavanac{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int h = reader.nextInt();
		int m = reader.nextInt();
		reader.close();

		if(m < 45){
			h = h == 0 ? 23 : h - 1;
			m += 15;
		} else m -= 45;

		System.out.printf("%d %d\n", h, m);
	}
}
