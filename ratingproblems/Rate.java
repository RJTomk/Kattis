// Success in 0.10s
import java.util.Scanner;

public class Rate{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int nJudge = sc.nextInt();
		int nVote = sc.nextInt();
		double sum = 0.0;
		int changeVal = 3 * (nJudge - nVote);

		for(int i = 0; i < nVote; i++) sum += sc.nextInt();
		sc.close();
		
		System.out.printf("%s %s \n", (sum - changeVal) / nJudge, (sum + changeVal) / nJudge);
	}
}
