// Solved in 0.11s
import java.util.Scanner;

public class Seed{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double cost = reader.nextDouble();
		int n = reader.nextInt();
		double totCost = 0;

		while(n-- > 0){
			double w = reader.nextDouble();
			double l = reader.nextDouble();

			totCost += w * l * cost;
		}
		reader.close();

		System.out.println(totCost);
	}
}
