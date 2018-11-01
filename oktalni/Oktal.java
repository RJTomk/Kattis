import java.util.Scanner;

public class Oktal{ // TODO: Run time error
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(Integer.toString(Integer.parseInt(sc.next(), 2), 8));
		sc.close();
	}
}
