// Success in 0.07s
import java.util.Scanner;

public class Terrace{
	public static void main(String[] args) {
		Scanner sc   = new Scanner(System.in);
		int max      = sc.nextInt();
		int n        = sc.nextInt();
		int nPeeps   = 0;
		int nBlocked = 0;

		while(n-- > 0){
			String act = sc.next();
			int val    = sc.nextInt();

			switch(act){
				case "enter":
					if(nPeeps + val <= max)
						nPeeps += val;
					else
						nBlocked++;
					break;
				case "leave":
					nPeeps -= val;
					break;
			}
		}

		System.out.println(nBlocked);
		sc.close();
	}
}
