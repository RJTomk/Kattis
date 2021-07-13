// Success in 0.10s
import java.util.Scanner;

public class Echo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        System.out.printf("%s %s %s", word, word, word);
        sc.close();
    }
}