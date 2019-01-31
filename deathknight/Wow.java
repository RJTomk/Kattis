// Success in 0.12s
import java.util.Scanner;

public class Wow{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int victories = n;
		while(n-- > 0){
			char[] moves = sc.next().toCharArray();
			for(int i = 0; i < moves.length - 1; i++)
				if(moves[i] == 'C' && moves[i + 1] == 'D'){
					victories--;
					break;
				}
		}
		sc.close();
		System.out.println(victories);
	}
}
