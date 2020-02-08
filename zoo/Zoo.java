// Success in 0.14s
import java.util.*;

public class Zoo{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int nList = 1;
		int nItems = reader.nextInt();
		reader.nextLine();
		while(nItems != 0){
			TreeMap<String, Integer> zoo = new TreeMap<String, Integer>();
			for(int i = 0; i < nItems; i++){
				String[] wholeAnimal = reader.nextLine().split(" ");
				String animal = wholeAnimal[wholeAnimal.length - 1].toLowerCase();

				zoo.put(animal, (zoo.containsKey(animal) ? zoo.get(animal) : 0) + 1);
			}

			System.out.printf("List %d:\n", nList++);
//			for(Map.Entry<String, Integer> animal : zoo.entrySet())
//				System.out.printf("%s | %d\n", animal.getKey(), animal.getValue());

			nItems = reader.nextInt();
			reader.nextLine();
		}

		reader.close();
	}
}
