// Success in 0.38s
import java.util.*;

public class Out{ // ODO: Fix
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nCases = sc.nextInt();
		for(int i = 1; i <= nCases; i++){
			int n = sc.nextInt();
			int[] nums = new int[n];
			for(int j = 0; j < n; j++)
				nums[j] += sc.nextInt();

			boolean found = false;
			for(int j = 0; j < n; j++){
				found = false;
				for(int k = 0; k < n; k++){
					if(j == k) continue;
					if(nums[j] == nums[k]){
						found = true;
						break;
					}
				}
				if(!found){
					System.out.printf("Case #%d: %d\n", i, nums[j]);
					break;
				}
			}
		}

		sc.close();
	}
}
