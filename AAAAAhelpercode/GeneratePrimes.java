public class GeneratePrimes{
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);

    System.out.print("{");
    for(int i = 1; i <= n; i++)
      if(isPrime(i))
        System.out.printf(", %d", i);

    System.out.println("}");
  }

  private static boolean isPrime(int n){
    if(n == 2)
      return true;
    else if(n % 2 == 0)
      return false;

    double sq = Math.sqrt(n);
    for(int i = 3; i <= sq; i+=2){
      if(n % i == 0)
        return false;
    }

    return true;
  }
}
