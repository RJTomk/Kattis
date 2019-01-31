// Success in 0.06s
import java.io.*;

public class CheckSum{
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        for(int i = 0; i < n; i++){
            String in = reader.readLine();
            int total = 0;
            for(int j = 0; j < in.length(); j++){
                if(j%2 == in.length() % 2){
                    int add = (in.charAt(j) - 48) * 2;
                    if(add >9){
                        int p = add % 10;
                        add = Math.floorDiv(add, 10);
                        //  += add;
                        add += p;
                    }// f

                    total+= add;
                }// f
                else{
                    total+= in.charAt(j)-48;
                }// lse
            }// or j
            if(total%10==0){
                System.out.println("PASS");
            }// f
            else{
                System.out.println("FAIL");
            }
        }// or i
    }
}
