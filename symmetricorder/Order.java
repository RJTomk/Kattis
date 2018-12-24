// Success in 0.15s
import java.util.Scanner;

public class Order{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, sets = 0;
		while((n = sc.nextInt()) != 0){
			String[] names = new String[n];
			int lo = 0;
			int hi = n - 1;

			for(int i = 0; i < n; i++){
				String name = sc.next();
				if(i % 2 == 0)
					names[lo++] = name;
				else
					names[hi--] = name;
			}

			System.out.printf("SET %d\n", ++sets);
			for(String name : names) System.out.println(name);
		}

		sc.close();
	}
}
