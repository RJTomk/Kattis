import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class DoublePlusGoodv2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int total = 0;
		int num = 0;
		for(int i = 0; i < input.length(); i++){
			if(input.charAt(i) == '+'){
				num++;
			}
		}
		String[] data = input.split("\\+");
		HashSet<Integer> seen = new HashSet<>();

		double n = Math.pow(2,num);
		for(int j = 0; j < n; j++){
			String binary = Integer.toString(j,2);
			System.out.println(binary);
			String add = "";
			for(int k = 0; k < data.length; k++){
				if(binary.length() <= k || binary.charAt(k) == '0'){
					add += data[k];
				}
				else{
					add += "+" + data[k];
				}
			}
			data = add.split("\\+");
			int sum = 0;
			for(int k = 0; k < data.length; k++){
				if(!data[k].equals("")){
					sum += Integer.parseInt(data[k]);
				}
				seen.add(sum);
			}
		}
		System.out.println(seen.size());
	}
}
