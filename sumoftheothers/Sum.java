// Success in 0.17s
import java.util.Scanner;

public class Sum{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(sc.hasNextLine()){
      String[] line = sc.nextLine().split(" ");
      int[] arr = new int[line.length];

      for(int i = 0; i < line.length; i++)
        arr[i] = Integer.parseInt(line[i]);

      System.out.println(findSum(arr));
    }
    sc.close();
  }

  private static Integer findSum(int[] arr){
    for(int i = 0; i < arr.length; i++){
      int sum = 0;
      for(int j = 0; j < arr.length; j++)
        sum += i == j ? 0 : arr[j];

      if(sum == arr[i])
        return sum;
    }

    return null;
  }
}
