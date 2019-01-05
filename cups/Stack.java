// Success in 0.15
import java.util.Scanner;
import java.util.PriorityQueue;

public class Stack{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); sc.nextLine();
		PriorityQueue<Cup> queue = new PriorityQueue<Cup>();

		while(n-- > 0){
			String[] data = sc.nextLine().split(" ");
			if(isInteger(data[0])) queue.add(new Cup(data[1], Integer.parseInt(data[0]) / 2));
			else queue.add(new Cup(data[0], Integer.parseInt(data[1])));
		}
		sc.close();

		Cup c = null;
		while((c = queue.poll()) != null) System.out.println(c.colour);
	}

	private static boolean isInteger(String s){
		for(char c : s.toCharArray())
			if(c < '0' || c > '9')
				return false;

		return true;
	}
}

class Cup implements Comparable<Cup>{
	public String colour;
	public int rad;

	public Cup(String cupColour, int cupRad){
		colour = cupColour;
		rad = cupRad;
	}

	public String toString(){
		return colour;
	}

	public int compareTo(Cup c){
		return rad - c.rad;
	}
}
