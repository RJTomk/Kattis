// Fails for some reason?

import java.util.Scanner;

public class Pyramid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nBlocks = sc.nextInt();
        sc.close();

        int sidel = 1;
        int i = 0;

        while(nBlocks >= (sidel * sidel)){
            nBlocks -= sidel * sidel;
            sidel += 2;
            i++;
        }

        System.out.println(i);
    }
}