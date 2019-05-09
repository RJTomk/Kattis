import java.util.*;

public class DoubleplusGood {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> noDoubles = new HashSet<>();
		int[] vals = parseToIntArray(sc.nextLine());
		sc.close();

//		used.add(arraySum(vals));

//		for (int i = 0; i < vals.length; i++) {
//			int longInt = vals[i];
//			for (int j = i + 1; j < vals.length; j++) {
//				longInt = concatInts(longInt, vals[j]);
//				int sum = 0;
//				for (int k = 0; k < i; k++)
//					sum += vals[k];
//				sum += longInt;
//				for (int k = j + 1; k < vals.length; k++)
//					sum += vals[k];
//
//				used.add(sum);
//			}
//		}
//		System.out.println(Math.pow(2, vals.length - 1) - used.size());

		int[] possibilities = readNums(vals);
		for(int p : possibilities)
			noDoubles.add(p);

		System.out.println(noDoubles.size());
	}

	private static int[] readNums(int[] vals){
		if(vals.length == 1)
			return vals;

		int[] smArray = readNums(Arrays.copyOf(vals, vals.length - 1));
		int[] newVals = new int[smArray.length * 2];

		for(int i = 0; i < smArray.length; i++){
			newVals[i * 2] = smArray[i] + vals[vals.length - 1];
			newVals[i * 2 + 1] = concatInts(smArray[i], vals[vals.length - 1]);
		}

		return newVals;
	}

	private static int arraySum(int[] arr) {
		int sum = 0;
		for (int a : arr)
			sum += a;
		return sum;
	}

	private static int[] parseToIntArray(String in) {
		String[] line = in.split("\\+");
		int[] res = new int[line.length];
		for (int i = 0; i < line.length; i++)
			res[i] = Integer.parseInt(line[i]);

		return res;
	}

	private static int concatInts(int a, int b) {
		return Integer.parseInt(String.format("%d%d", a, b));
	}
}
