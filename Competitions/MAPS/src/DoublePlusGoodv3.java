import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DoublePlusGoodv3 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] vals = parseToIntArray(sc.nextLine());
		sc.close();
		HashSet<Integer> sums = new HashSet<>();

		for (int i = 0; i < Math.pow(2, vals.length); i++) {
			boolean[] possibilities = new boolean[vals.length];
			char[] bin = Integer.toBinaryString(i).toCharArray();

			int j = possibilities.length - 1, k = bin.length - 1;
			while(k >= 0)
				possibilities[j--] = bin[k--] == '1';
			while (j >= 0)
				possibilities[j--] = false;

			ArrayList<Integer> valList = new ArrayList<>(Arrays.stream(vals).boxed().collect(Collectors.toList()));

			j = valList.size() - 1; k = possibilities.length - 1;
			while(k >= 0){
				if(possibilities[k--]) {
					int b = valList.remove(j--);
					int a = valList.get(j);
					valList.set(j, concatonateInts(a, b));
				}
				j--;
			}
			Integer[] addableInts = valList.toArray(new Integer[0]);
			int sum = 0;
			for(int add : addableInts)
				sum += add;

			sums.add(sum);
		}

		System.out.println(sums.size());
	}

	private static int concatonateInts(int a, int b){
		return Integer.parseInt(String.format("%d%d", a, b));
	}

	private static int[] parseToIntArray(String l){
		String[] line = l.split("\\+");
		int[] res = new int[line.length];
		for (int i = 0; i < line.length; i++)
			res[i] = Integer.parseInt(line[i]);

		return res;
	}
}
