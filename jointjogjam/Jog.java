// Success in 0.10s
import java.util.Scanner;

public class Jog{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] l = new double[2];

        for(int i = 0; i < 2; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            l[i] = Math.sqrt(Math.pow(Math.abs(x1 - x2), 2) + Math.pow(Math.abs(y1 - y2), 2));
        }
        sc.close();

        System.out.println(l[0] > l[1] ? l[0] : l[1]);
    }
}