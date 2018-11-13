import java.util.*;
public class LeftAndRight { // TODO: Fix time problem with linked list

	private static ArrayList<Byte> used = new ArrayList<Byte>();

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		char[] moves = reader.next().toCharArray();
		reader.close();

		firstRun(n, moves);

		for(int i = 0; i < used.size(); i++)
			System.out.println(used.get(i));
	}

	private static void firstRun(int n, char[] moves) {
		for(int i = 1; i <= n; i++) {
			used.add((byte)i);
			if(test(n, i, moves))
				return;
			used.remove(used.size() - 1);
		}
	}

	private static boolean test(int n, int pos, char[] moves) {
		if(moves.length == 0) return true;
		int interval  = moves[0] == 'R' ? 1 : -1;

		for(int i = pos + interval; i > 0 && i <= n; i += interval)
		{
			if(!used.contains((byte)i)) {
				used.add((byte)i);
				if(test(n, i, stripFirst(moves))) {
					return true;
				}

				used.remove(used.size() - 1);
			}
		}
		return false;
	}

	private static char[] stripFirst(char[] arr) {
		char[] res  = new char[arr.length - 1];
		for(int i = 1; i < arr.length; i++)
			res[i - 1] = arr[i];

		return res;
	}

}
