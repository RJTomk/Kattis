// Success in 0.15s
import java.util.Scanner;

public class Food{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] keep = new boolean[365];
		int n = sc.nextInt();

		while(n-- > 0){
			int a = sc.nextInt(), b = sc.nextInt();
			for(int j = a-1; j < b; j++)
				keep[j] = true;
		}

		int tot = 0;
		for(int i = 0; i < 365; i++)
			if(keep[i]) tot++;
		System.out.println(tot);
	}
}
