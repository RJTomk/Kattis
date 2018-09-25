// Success in 0.48s
import java.util.*;

public class Trees{
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int n = reader.nextInt();
    int[] trees = new int[n];

    for(int i = 0; i < n; i++)
      trees[i] = reader.nextInt();

    reader.close();

    // for(int i = 0; i < trees.length - 1; i++)
    //   for(int j = i; j < trees.length; j++)
    //     if(trees[j] >= trees[i]){
    //       int temp = trees[j];
    //       trees[j] = trees[i];
    //       trees[i] = temp;
    //     }

    Arrays.sort(trees);
    for(int i = 0; i < (trees.length) / 2; i++){
      int temp = trees[i];
      trees[i] = trees[trees.length - i - 1];
      trees[trees.length - i -1] = temp;
    }

    int longest = 0;

    for(int i = 0; i < trees.length; i++){
      if((trees[i] + i) > longest)
        longest = trees[i] + i;
    }

    System.out.println(longest + 2);
  }
}
