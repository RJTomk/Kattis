import java.util.Scanner;

public class Map{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		char[] split = reader.next().toCharArray();
		reader.close();

		int x = 0;
		int y = 0;

		for(char c : split){
			x *= 2;
			y *= 2;

			int num = (int)c - (int)'0';
			switch(num){
				case 3:
					x++;
				case 2:
					y++;
					break;
				case 1:
					x++;
					break;
				case 0: break;
			}
		}

		System.out.printf("%d %d %d", split.length, x, y);
	}
}
