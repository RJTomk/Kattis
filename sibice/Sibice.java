// Success in 0.08s
import java.util.Scanner;

public class Sibice{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n       = reader.nextInt();
		double w    = (double)reader.nextInt();
		double h    = (double)reader.nextInt();
		double maxL = Math.sqrt(w * w + h * h);

		while(n-- > 0){
			int match = reader.nextInt();
			if(match <= maxL) System.out.println("DA");
			else System.out.println("NE");
		}

		reader.close();
	}
}
