// Success in 0.11s
import java.util.Scanner;
import java.util.ArrayList;
import java.util.AbstractCollection;

public class Speed{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() - 1;
        ArrayList<Integer> speeds = new ArrayList<Integer>();
        int pt = sc.nextInt();
        int pd = sc.nextInt();

        for(int i = 0; i < n; i++){
            int t = sc.nextInt();
            int d = sc.nextInt();

            int speed = (d - pd) / (t - pt);
            speeds.add(speed);
            pt = t;
            pd = d;
        }
        sc.close();

        int max = 0;
        for(int i = 0; i < speeds.size(); i++)
            if (speeds.get(i) > max)
                max = speeds.get(i);

        System.out.println(max);
    }
}