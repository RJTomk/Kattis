// Success in 0.07s
import java.util.Scanner;

public class Duplicates{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] words = sc.nextLine().split(" ");
		sc.close();

		for(int i = 0; i < words.length - 1; i++)
			for(int j = i + 1; j < words.length; j++)
				if(words[i].equals(words[j])){
					System.out.println("no");
					return;
				}

		System.out.println("yes");
	}
}
