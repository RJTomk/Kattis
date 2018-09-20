import java.util.Scanner;

public class Pizza{
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int pizzaLength = Integer.parseInt(reader.next());
    int crustLength = Integer.parseInt(reader.next());
    reader.close();

    int cheeseLength = pizzaLength - crustLength;

    double pizzaArea = (pizzaLength * pizzaLength) * Math.PI;
    double cheeseArea = (cheeseLength * cheeseLength) * Math.PI;

    System.out.println((cheeseArea / pizzaArea) * 100);
  }
}
