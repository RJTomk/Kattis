// Success in 0.08s
import java.util.*;

public class Zanzibar{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();

		while(n-- > 0){
			int prev = reader.nextInt(), val = reader.nextInt();
			int imported = 0;
			while(val != 0){
				if(2*prev < val)
					imported += val - (2*prev);

				prev = val;
				val = reader.nextInt();
			}
			System.out.println(imported);
		}
	reader.close();
	}
}
