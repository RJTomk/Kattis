import java.util.*;

public class Out{ // ODO: Fix
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i = 1; i <= N; i++){
			int n = sc.nextInt();
			int[] arr = new int[n];
			ArrayList<Integer> used = new ArrayList<Integer>();
			for(int j = 0; j < n; j++) arr[j] = sc.nextInt();
			for(int j = 0; j < n - 1; j++){
				
				if(used.contains(j)) continue;

				boolean found = false;
				for(int k = j + 1; k < n; k++){
					if(arr[j] == arr[k]){
						found = true;
						break;
					}
				}

				if(found == false){
					System.out.printf("Case #%d: %d\n", i, arr[j]);
					break;
				}
				used.add(j);
			}
		}

		sc.close();
	}
}
