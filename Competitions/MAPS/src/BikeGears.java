import java.util.Arrays;
import java.util.Scanner;

public class BikeGears {
	public static void main(String[] args) {
		Scanner fileScanner = new Scanner(System.in);
		int nFrontGears = fileScanner.nextInt();
		int nBackGears = fileScanner.nextInt();
		int[] frontGearArray = new int[nFrontGears];
		int[] backGearArray = new int[nFrontGears];

		for (int i = 0; i < nFrontGears; i++)
			frontGearArray[i] = fileScanner.nextInt();
		for (int i = 0; i < nBackGears; i++)
			backGearArray[i] = fileScanner.nextInt();

		fileScanner.close();
		Gear[] gears = new Gear[nFrontGears * nBackGears];

		for (int i = 0; i < nFrontGears; i++)
			for (int j = 0; j < nBackGears; j++)
				gears[i * nBackGears + j] = new Gear(frontGearArray[i], backGearArray[j]);

		Arrays.sort(gears);
		for (Gear gear : gears)
			System.out.println(gear);
	}
}

class Gear implements Comparable<Gear> {
	protected long frontGear, backGear;

	public Gear(long frontGear, long backGear) {
		this.frontGear = frontGear;
		this.backGear = backGear;
	}

	@Override
	public int compareTo(Gear o) {
		long ad = frontGear * o.backGear;
		long bc = backGear * o.frontGear;

		if (ad == bc)
			return (int)(frontGear - o.frontGear);

		return ad > bc ? 1 : -1;
	}

	@Override
	public String toString() {
		return String.format("(%d,%d)", frontGear, backGear);
	}
}
