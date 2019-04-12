// Merge sort with counting somehow
import java.util.Scanner;

public class UQS{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
    sc.close();
    System.out.println(merge(arr, 0, arr.length));

  }

  private static int merge(int[] arr, int first, int last){
    if(first >= last) return 0;

    int half = (first + last) / 2, count = 0;
    merge(arr, first, half);
    merge(arr, half + 1, last);

    int[] sArr = new int[last - first + 1];
    int i = first, j = half + 1, k = 0;

    while(i < (half + 1) && j < last){
      if(arr[i] <= arr[j])
        sArr[k++] = arr[i++];
      else{
        sArr[k++] = arr[j++];
        count++;
      }
    }

    while(i <= half)
      sArr[k++] = arr[i++];
    while(j <= last){
      sArr[k++] = arr[j++];
      count++;
    }

    i = 0;
    for(int n : sArr)
      arr[i++] = n;

    return count;
  }
}
