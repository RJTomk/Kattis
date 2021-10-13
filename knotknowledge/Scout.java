// Success in 0.11s
import java.util.Scanner;

public class Scout{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] full = new int[n];
        int[] her = new int[n - 1];

        for(int i = 0; i < n; i++) full[i] = sc.nextInt();
        for(int i = 0; i < n - 1; i++) her[i] = sc.nextInt();
        sc.close();

        boolean found = false;
        for(int i = 0; i < n; i++){
            found = false;
            for(int j = 0; j < n - 1; j++){
                if((her[j] == full[i])){
                    found = true;
                    break;
                }
            }

            if(!found){
                System.out.println(full[i]);
                break;
            }
        }
    }
}