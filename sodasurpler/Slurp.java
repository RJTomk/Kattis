// Success in 0.14s
import java.util.Scanner;

public class Slurp{
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int bottles = sc.nextInt();
		int empties = sc.nextInt() + bottles;
		int cost    = sc.nextInt();
		int drinks  = 0;
		sc.close();

		while(empties >= cost){
			empties -= cost;
			empties++;
			drinks++;
		}

		System.out.println(drinks);
	}
}
