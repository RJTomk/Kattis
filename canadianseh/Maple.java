// Success in 0.09s

import java.util.Scanner;

public class Maple{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        System.out.println(words.endsWith("eh?") ? "Canadian!" : "Imposter!");
        sc.close();
    }
}