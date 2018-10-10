// Success in 0.07s
import java.util.*;

public class Kornislav{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int[] lengths = new int[4];
		for(int i = 0; i < 4; i++)
			lengths[i] = reader.nextInt();

		reader.close();
		Arrays.sort(lengths);
		System.out.println(Math.min(lengths[0], lengths[1]) * Math.min(lengths[2], lengths[3]));
	}
}
