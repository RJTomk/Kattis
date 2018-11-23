// Success from 0.49s
import java.util.Scanner;

public class Launch{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = 0, minT = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++){
			int N = sc.nextInt();
			if(N < minT){
				minT = N;
				min  = i;
			}
		}
		sc.close();
		System.out.println(min);
	}
}
