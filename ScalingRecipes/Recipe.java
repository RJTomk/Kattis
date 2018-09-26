// Success in 0.92s
import java.util.*;

public class Recipe{
	public static void main(String[] args) {
		new Recipe().run();
	}

	public void run() {
		Scanner reader = new Scanner(System.in);
		int numRecipe = reader.nextInt();
		for(int i = 0; i < numRecipe; i++){
			int numItems       = reader.nextInt();
			int numPortions    = reader.nextInt();
			int wantPortions   = reader.nextInt();
			Item[] ingredient  = new Item[numItems];
			int mainIngredient = -1;

			for(int j = 0; j < numItems; j++){
				ingredient[j] = new Item(reader.next(), reader.nextDouble(), reader.nextDouble() / 100);
				if(ingredient[j].Percentage == 1)
					mainIngredient = j;
			}
			ingredient[mainIngredient].Weight *= (double)wantPortions / (double)numPortions;

			for(int j = 0; j < numItems; j++){
				if(j == mainIngredient) continue;
				ingredient[j].Weight = ingredient[mainIngredient].Weight * ingredient[j].Percentage;
			}

			System.out.println("Recipe # " + (i + 1));
			for(int j = 0; j < numItems; j++)
				System.out.println(ingredient[j].Name + " " + ingredient[j].Weight);

			for(int j = 0; j < 40; j++) System.out.print("-");
			System.out.println();
		}

		reader.close();
	}

	private class Item{
		public String Name;
		public double Weight;
		public double Percentage;

		public Item(String name, double weight, double percentage){
			Percentage = percentage;
			Weight     = weight;
			Name       = name;
		}
	}
}
