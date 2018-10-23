// Success in 0.07s
import java.util.Scanner;

public class Trik{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String line = reader.nextLine();
		reader.close();

		char cup = 'A';
		for(char c : line.toCharArray()){
			switch(c){
				case 'A':
					if(cup == 'C') break;
					cup = cup == 'A' ? 'B' : 'A';
					break;
				case 'B':
					if(cup == 'A') break;
					cup = cup == 'B' ? 'C' : 'B';
					break;
				case 'C':
					if(cup == 'B') break;
					cup = cup == 'C' ? 'A' : 'C';
					break;
			}
		}

		System.out.printf("%d\n", ((int)cup - (int)'A') + 1);
	}
}
