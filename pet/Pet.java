// Success in 0.08s
import java.util.*;

public class Pet{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int topI = 0, largest = 0;

		for(int cont = 1; cont <= 5; cont++){
			int score = 0;
			for(int i = 0; i < 4; i++) score += reader.nextInt();

			if(largest < score){
				largest = score;
				topI = cont;
			}
		}

		System.out.printf("%d %d\n", topI, largest);
		reader.close();
	}
}
