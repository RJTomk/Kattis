import java.util.*;

public class Awards{ // TODO: Test
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		ArrayList<String> used = new ArrayList<String>();
		String[][] winners = new String[12][2];

		for(int i = 0; i < 12; i++){
			String uni = "";
			String team = "";
			do{
				uni = reader.next();
				team = reader.next();
			}while(used.contains(uni));
			used.add(uni);
			winners[i][0] = uni;
			winners[i][1] = team;
		}

		for(int i = 0; i < 12; i++) System.out.printf("%s %s\n", winners[i][0], winners[i][1]);
		reader.close();
	}
}
