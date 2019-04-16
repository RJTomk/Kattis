// Success in 0.21s
import java.util.Scanner;

public class Oktal{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		sc.close();

		int nNeededZeros = 3 - (num.length() % 3);
		if(nNeededZeros == 2)
			num = "00" + num;
		else if(nNeededZeros == 1)
			num = "0" + num;

		String ret = "";

		while(num.length() > 0){
			String dig = num.substring(0, 3);
			num = num.substring(3);

			ret += toOktal(dig);
		}

		System.out.println(ret);
	}

	private static String toOktal(String dig){
		String[] oktals = new String[]{"000", "001", "010", "011", "100", "101", "110", "111"};

		for(int i = 0; i < oktals.length; i++)
			if(dig.equals(oktals[i]))
				return Integer.toString(i);

		return "Fail with " + dig;
	}
}
