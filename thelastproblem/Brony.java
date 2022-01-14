// Success in 0.10s
import java.util.Scanner;

public class Brony{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        sc.close();

        System.out.printf("Thank you, %s, and farewell!\n", name);
    }
}