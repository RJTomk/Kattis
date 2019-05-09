// Success in 0.15s
import java.util.Scanner;

public class FractalArea {
	public static void main(String[] args){
		Scanner fileScanner = new Scanner(System.in);
		int n = fileScanner.nextInt();

		while(n-- > 0){
			double radius = fileScanner.nextInt();
			int nIterations = fileScanner.nextInt();
			double area = 0;

			if(nIterations >= 3)
				area += fractalRadius(radius / 4f, nIterations - 2) * 12;
			if(nIterations >= 2)
				area += Math.PI * Math.pow(radius / 2f, 2f) * 4;
			if(nIterations >= 1)
				area += Math.PI * Math.pow(radius, 2f);

			System.out.println(area);
		}
	}

	public static double fractalRadius(double radius, int numRemainingIterations){
		double area = Math.PI * Math.pow(radius, 2);

		if(numRemainingIterations > 1)
			area += fractalRadius(radius / 2f, numRemainingIterations - 1) * 3;

		return area;
	}
}
