// Success in 0.16s
import java.util.Scanner;

public class Cannonball{
	private static final double g = 9.81;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();

		while(n-- > 0){
			double v  = reader.nextDouble();
			double d  = Math.toRadians(reader.nextDouble());
			double x  = reader.nextDouble();
			double h1 = reader.nextDouble();
			double h2 = reader.nextDouble();

			double t = x / (v * Math.cos(d));
			double y = (v*t*Math.sin(d)) - ((g*t*t)/2);

			System.out.printf("%s\n", h1 + 1 <= y &&
			y <= h2 - 1 ? "Safe" : "Not Safe");
		}

		reader.close();
	}
}
