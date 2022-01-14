// Success in 0.13s
import java.util.Scanner;

public class Team {
    public static String asteriskLine(int n){
        String str = "";
        for(int i = 0; i < n; i++) str = str + "*";
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nRoom = sc.nextInt(), nTeam = sc.nextInt();
        sc.close();

        int diff = nTeam % nRoom;
        for(int i = 0; i < nRoom; i++){
            int n = (nTeam - diff) / nRoom;
            if(i < diff) System.out.println(asteriskLine(n + 1));
            else System.out.println(asteriskLine(n));
        }
    }
}