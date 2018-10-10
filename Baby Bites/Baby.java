import java.util.Scanner;

public class Baby{ // TODO: Fix
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();

		for(int i = 1; i <= n; i++){
			String cnt = reader.next();

			if(!isMumble(cnt)){
				int val = Integer.parseInt(cnt);
				if(val != i){
					System.out.println("something is fishy" + val);
					reader.close();
					return;
				}
			}
		}

		reader.close();
		System.out.println("makes sense");
	}

	private static boolean isMumble(String cnt){
		char[] mumble = "mumble".toCharArray();
		if(mumble.length != cnt.length()) return false;

		for(int i = 0; i < cnt.length(); i++)
			if(mumble[i] != cnt.charAt(i))
				return false;

		return true;
	}
}
