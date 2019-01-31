import java.util.*;

public class Dyslectionary{ // ODO: Figure out how to test
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<String[]> groups = new ArrayList<String[]>();

		ArrayList<String> input = new ArrayList<String>();
		while(reader.hasNextLine()){
			String line = reader.nextLine();
			if(line == ""){
				groups.add(AddWhiteSpace(SortArrayList(input)));
				input.clear();
			}

			input.add(line);
		}

		reader.close();

		for(int i = 0; i < groups.size(); i++){
			for(String word : groups.get(i))
				System.out.println(word);
			if(i < groups.size() - 1) System.out.println();
		}
	}

	private static String[] SortArrayList(ArrayList<String> inpt){
		String[] group = (String[])inpt.toArray();
		for(int i = 0; i < group.length - 1; i++)
			for(int j = i + 1; j < group.length; j++)
				if(ShouldSwitch(group[i], group[j])){
					String temp = group[i];
					group[i] = group[j];
					group[j] = temp;
				}

		return group;
	}

	private static String[] AddWhiteSpace(String[] group){
		int necLength = 0;
		for(String word : group)
			if(word.trim().length() > necLength)
				necLength = word.trim().length();

		for(int i = 0; i < group.length; i++){
			String space = "";
			for(int j = 0; j < necLength - group[i].trim().length(); j++) space += " ";
			group[i] = space + group[i].trim();
		}

		return group;
	}

	private static boolean ShouldSwitch(String a, String b){
		for(int i = Math.min(a.length(), b.length()) - 1; i >= 0; i--){
			if(a.charAt(a.length() - i) < b.charAt(b.length() - i))
				return false;
			else if(a.charAt(a.length() - i) > b.charAt(b.length() - i))
				return true;
		}

		return false;
	}
}
