import java.util.Scanner;

public class Dice{ // TODO: Fix random wrong answer (fringe case?)
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float gunnar = average(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
    float emma = average(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
    sc.close();

    if(emma > gunnar) System.out.println("Emma");
    else if(gunnar > emma) System.out.println("Gunnar");
    else System.out.println("Tie");
  }

  private static float average(int a, int b, int c, int d){
    float d1 = (a + b) / 2;
    float d2 = (c + d) / 2;
    return (d1 + d2) / 2;
  }
}
