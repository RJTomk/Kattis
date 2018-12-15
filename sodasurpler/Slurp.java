import java.util.Scanner;

public class Slurp{ // TODO: Fix, everything's wrong
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int bottles = sc.nextInt();
		int empties = sc.nextInt();
		int cost    = sc.nextInt();
		int drinks  = 0;
		sc.close();

		do{
			drinks += Math.floorDiv(bottles, cost);
			bottles = Math.floorDiv(bottles + empties, cost) + (bottles % cost);
		}while(bottles > cost);

		System.out.println(drinks);
	}
}
