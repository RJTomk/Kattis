// Success in 0.08s
import java.util.Scanner;

public class DriversDilemma{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        double cap  = reader.nextDouble() / 2F;
        double leak = reader.nextDouble();
        double dist = reader.nextDouble();

        double[] mileage = new double[6];
        for(int i = 0; i < 6; i++){
            reader.nextInt();
            mileage[i] = reader.nextDouble();
        }

        int speed = 80;
        for(int i = mileage.length - 1; i >= 0; i--){
            double time = dist / (double)speed;
            if(cap - (dist / mileage[i]) - (leak * time) > 0){
                System.out.printf("YES %d\n", speed);
                return;
            }

            speed -= 5;
        }

        System.out.println("NO");
    }
}
