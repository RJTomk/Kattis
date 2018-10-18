// Success in 0.09s
import java.util.Scanner;

public class Hacks{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		while(n-- > 0){
			int a = reader.nextInt(), b = reader.nextInt(), c = reader.nextInt();
			if(b - c > a) System.out.println("advertise");
			else if(b - c == a) System.out.println("does not matter");
			else if(b - c < a) System.out.println("do not advertise");
		}
		reader.close();
	}
}
