// Success in 0.08s
import java.util.*;

public class Bat{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		ArrayList<Integer> hits = new ArrayList<Integer>();

		while(n-- > 0) hits.add(reader.nextInt());
		reader.close();

		int sum = 0;
		for(int i = 0; i < hits.size(); i++)
			if(hits.get(i) < 0){
				hits.remove(i);
				i--;
			}else{
				sum += hits.get(i);
			}

		System.out.println((double)sum / (double)hits.size());
	}
}
