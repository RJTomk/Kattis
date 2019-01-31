// Success in 0.07s
import java.util.Scanner;

public class Binary{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(Integer.parseInt(reverse(Integer.toString(sc.nextInt(), 2)), 2));

		sc.close();
	}

	private static String reverse(String inp){
		char[] inpArr = inp.toCharArray();

		for(int i = 0; i < inpArr.length / 2; i++){
			char temp = inpArr[i];
			inpArr[i] = inpArr[inpArr.length - i - 1];
			inpArr[inpArr.length - i - 1] = temp;
		}

		return new String(inpArr);
	}
}
