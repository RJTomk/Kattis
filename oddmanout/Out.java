import java.util.*;

public class Out { //TODO: Figure out why entrySet is not working
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
	//	while(n-- > 0){
		for(int i = 1; i <= n; i++){
			int nV = sc.nextInt();
			TreeMap map = new TreeMap<Integer, Boolean>();
			while(nV -- > 0){
				int val = sc.nextInt();
				map.put(val, map.containsKey(val) ? !(Boolean)map.get(val) : false);
			}

			for(Map.Entry<Integer, Boolean> entry : map.entrySet())
				if((Boolean)entry.getValue()){
					System.out.printf("Case #%d: %d", i, (int)entry.getKey());
					break;
				}
		}
	}
}
