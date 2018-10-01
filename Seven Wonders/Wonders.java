// Success in 0.07s
import java.util.Scanner;

public class Wonders{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int t = 0, c = 0, g = 0;
		String line = reader.nextLine();

		for(char ch : line.toCharArray())
			switch(ch){
				case 'T': t++; break;
				case 'C': c++; break;
				case 'G': g++; break;
			}

		System.out.printf("%d\n", (t * t) + (c * c) + (g * g) + (7 * Math.min(Math.min(t, c), g)));
		reader.close();
	}
}
