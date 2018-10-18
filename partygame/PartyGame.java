//Success in 0.45s
import java.util.*;

public class PartyGame{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- >0){
            int n = sc.nextInt();
            int[] cards = new int[n];
            for(int i = 0; i < n; i++)
                cards[i] = sc.nextInt() - 1;

            while(n-- > 0){
                int[] newCards = new int[cards.length];
                for(int i = 0; i < cards.length; i++){
                    newCards[i] = cards[cards[i]];
                    //System.out.println(Arrays.toString(newCards) + " Inside while");
                }
                cards = newCards.clone();
                //System.out.println(Arrays.toString(cards));
            }

            boolean sorted = true;
            for (int i=0; i<cards.length; i++){
                if (cards[i] != i){
                    System.out.println("Some starve.");
                    sorted = false;
                    break;
                }
            }
            if (sorted)
                System.out.println("All can eat.");
        }
        sc.close();

    }

}
