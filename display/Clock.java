import java.util.Scanner;

public class Clock{ // TODO: Fix
  private static String[][] numbers = new String[][]{
    // Zero
    {
      "+---+", // Line 1
      "|   |", // Line 2
      "|   |", // Line 3
      "+   +", // Line 4
      "|   |", // Line 5
      "|   |", // Line 6
      "+---+"  // Line 7
    },
    // One
    {
      "    +", // Line 1
      "    |", // Line 2
      "    |", // Line 3
      "    +", // Line 4
      "    |", // Line 5
      "    |", // Line 6
      "    +"  // Line 7
    },
    // Two
    {
      "+---+", // Line 1
      "    |", // Line 2
      "    |", // Line 3
      "+---+", // Line 4
      "|    ", // Line 5
      "|    ", // Line 6
      "+---+"  // Line 7
    },
    // Three
    {
      "+---+", // Line 1
      "    |", // Line 2
      "    |", // Line 3
      "+---+", // Line 4
      "    |", // Line 5
      "    |", // Line 6
      "+---+"  // Line 7
    },
    // Four
    {
      "+   +", // Line 1
      "|   |", // Line 2
      "|   |", // Line 3
      "+---+", // Line 4
      "    |", // Line 5
      "    |", // Line 6
      "    +"  // Line 7
    },
    // Five
    {
      "+---+", // Line 1
      "|    ", // Line 2
      "|    ", // Line 3
      "+---+", // Line 4
      "    |", // Line 5
      "    |", // Line 6
      "+---+"  // Line 7
    },
    // Six
    {
      "+---+", // Line 1
      "|    ", // Line 2
      "|    ", // Line 3
      "+---+", // Line 4
      "|   |", // Line 5
      "|   |", // Line 6
      "+---+"  // Line 7
    },
    // Seven
    {
      "+---+", // Line 1
      "    |", // Line 2
      "    |", // Line 3
      "    +", // Line 4
      "    |", // Line 5
      "    |", // Line 6
      "    +", // Line 7
    },
    // Eight
    {
      "+---+", // Line 1
      "|   |", // Line 2
      "|   |", // Line 3
      "+---+", // Line 4
      "|   |", // Line 5
      "|   |", // Line 6
      "+---+"  // Line 7
    },
    // Nine
    {
      "+---+", // Line 1
      "|   |", // Line 2
      "|   |", // Line 3
      "+---+", // Line 4
      "    |", // Line 5
      "    |", // Line 6
      "+---+"  // Line 7
    }
  };

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String time;
    while(!(time = sc.next()).equals("end")){
      int[] nums = numList(time);

      for(int i = 0; i < 7; i++){
        for(int j = 0; j < 4; j++){
          System.out.print(numbers[nums[j]][i]);

          if(j == 1){
            if(i == 2 || i == 4){
              System.out.print("  o  ");
            }else{
              System.out.print("     ");
            }
          }else if(j == 3){
            System.out.println();
          }else{
            System.out.print("  ");
          }
        }
      //  System.out.println();
      }
      System.out.println("\n");
    }
    sc.close();
    System.out.println("end");
  }

  private static int[] numList(String t){
    int i = 0;
    int[] nums = new int[4];
    for(char c : t.toCharArray()){
      if(c == ':') continue;
      nums[i++] = c - '0';
    }

    return nums;
  }
}
