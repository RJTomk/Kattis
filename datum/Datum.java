//Success in 0.07s
import java.util.Scanner;

public class Datum{
  private static final String[] DOTW = {
    "Sunday",
    "Monday",
    "Tuesday",
    "Wednesday",
    "Thursday",
    "Friday",
    "Saturday"
  };

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int day = 3 + sc.nextInt() + monthToDay(sc.nextInt());

    System.out.println(DOTW[day % 7]);
  }

  private static int monthToDay(int month){
    int ret = 0;
    switch(month){
      case 12: ret += 30;
      case 11: ret += 31;
      case 10: ret += 30;
      case 9: ret += 31;
      case 8: ret += 31;
      case 7: ret += 30;
      case 6: ret += 31;
      case 5: ret += 30;
      case 4: ret += 31;
      case 3: ret += 28;
      case 2: ret += 31;
      case 1: break;
    }

    return ret;
  }
}
