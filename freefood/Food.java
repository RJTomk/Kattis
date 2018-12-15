import java.util.Scanner;

public class Food{ // TODO: Wrong answer
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fDays = 0, stDay = sc.nextInt(), enDay = sc.nextInt();

		while(--n > 0){
			int nS = sc.nextInt();
			int en = sc.nextInt();

			if(nS > enDay || en < stDay){
				fDays += enDay - stDay + 1;
				stDay = nS;
				enDay = en;
				continue;
			}

			stDay = nS < stDay ? nS : stDay;
			enDay = en > enDay ? en : enDay;
		}
		sc.close();

		System.out.println(fDays + enDay - stDay + 1);
	}
}
