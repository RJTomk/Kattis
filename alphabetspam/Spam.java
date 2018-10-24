//Success in 0.14s
import java.util.Scanner;

public class Spam{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] line = sc.nextLine().toCharArray();
		sc.close();

		int w = 0, l = 0, u = 0, s = 0;

		for(char c : line){
			if(c == '_')
				w++;
			else if('a' <= c && c <= 'z')
				l++;
			else if('A' <= c && c <= 'Z')
				u++;
			else
				s++;
		}

		System.out.printf("%.16f\n%.16f\n%.16f\n%.16f\n",
		(double)w / (double)line.length,
		(double)l / (double)line.length,
		(double)u / (double)line.length,
		(double)s / (double)line.length);
	}
}
