package encodedmessage;
import java.util.Scanner;
public class Decode {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n-- > 0){
            String line = sc.nextLine();
            int sLength = (int)Math.sqrt(line.length());

        }
    }

    private static char[][] fillSquare(String line) {
        char[][] square = new char[sLength][sLength];
        int s = 0;
        for(int i = 0; i < square.length; i++)
            for(int j = 0; j < square.length; j++)
                square[i][j] = line.charAt(s++);

        return square;
    }
}
