// Success in 0.10s
import java.util.Scanner;

public class Baby{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n          = reader.nextInt(); reader.nextLine(); // Force it to line 2
		String[] line  = reader.nextLine().split(" ");
		reader.close();

		if(line.length != n){
			System.out.println("something is fishy");
			return;
		}

		for(int i = 0; i < n; i++)
			if(!line[i].equals("mumble"))
				if(Integer.parseInt(line[i]) != i + 1){
					System.out.println("something is fishy");
					return;
				}

		reader.close();
		System.out.println("makes sense");
	}
}
