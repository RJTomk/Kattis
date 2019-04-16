import java.util.Scanner;
import java.util.ArrayList;

public class Num{ // TODO: Wrong answer
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); sc.nextLine();

		while(n-- > 0){
			int[] digits = toDigArray(sc.nextLine());
			System.out.println(fromSexa(digits));
		}

		sc.close();
	}

	private static int[] toDigArray(String line){
		ArrayList<Integer> ret = new ArrayList<>();
		int v = 0;
		for(char c : line.toCharArray()){
			if(c == ','){
				ret.add(v);
				v = 0;
			} else {
				v *= 10;
				v += (c - '0');
			}
		}

		ret.add(v);

		return ret.stream().mapToInt(Integer::intValue).toArray();
	}

	private static int fromSexa(int[] digits){
		int ret = 0;
		for(int i = 0; i < digits.length; i++)
			if(digits[i] > 0)
				ret += digits[i] * Math.pow(60, digits.length - 1 - i);

		return ret;
	}
}
