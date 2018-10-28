import java.util.Scanner;

public class Order{ // TODO: Fix: all wrong
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = 0, n = sc.nextInt();
		while(n != 0){
			i++;
			String[] names = new String[n];
			for(int j = 0; j < n; j++){
				names[j % 2 == 0 ? j / 2 : n - ((j - 1) / 2) - 1] = sc.next();
			}

			System.out.println("SET " + i);
			for(String nam : names) System.out.println(nam);
		}

		sc.close();
	}
}
