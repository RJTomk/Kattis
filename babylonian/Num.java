import java.util.Scanner;

public class Num{ // TODO: Runtime error
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); sc.nextLine();

		while(n-- > 0){
			String babyl = sc.nextLine();
			String[] nums = babyl.split(",");

			int sum = 0;
			int numC = numCommas(babyl);

			for(int i = 0; i < nums.length; i++)
				sum += Integer.parseInt(nums[i]) * Math.pow(60, numC - i);

			System.out.println(sum);
		}

		sc.close();
	}

	private static int numCommas(String s){
		int num = 0;

		for(char c : s.toCharArray()) if(c == ',') num++;

		return num;
	}
}
