import java.util.Scanner;

public class Chess{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int[] p = new int[6];
		for(int i = 0; i < 6; i++) p[i] = reader.nextInt();

		System.out.printf("%d %d %d %d %d %d\n", 1 - p[0], 1 - p[1], 2 - p[2], 2 - p[3], 2 - p[4], 8 - p[5]);
		reader.close();
	}
}
