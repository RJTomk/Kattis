// Success in 0.07s
import java.util.*;

public class Modulo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> vals = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++){
			int val = sc.nextInt() % 42;
			if(!vals.contains(val))
				vals.add(val);
		}

		System.out.println(vals.size());
		sc.close();
	}
}
