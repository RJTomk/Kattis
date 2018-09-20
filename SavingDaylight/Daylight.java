import java.util.Scanner;

public class Daylight{
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    while(reader.hasNext()){
      String month = reader.next();
      int day = reader.nextInt();
      int year = reader.nextInt();

      String time1 = reader.next();
      String time2 = reader.next();

      String[] split1 = time1.split(":");
      String[] split2 = time2.split(":");

      int hour = Integer.parseInt(split2[0]) - Integer.parseInt(split1[0]);
      int min1 = Integer.parseInt(split1[1]), min2 = Integer.parseInt(split2[1]);
      int min;

      if(min1 > min2){
        hour--;
        min = min2 + 60 - min1;
      }else
        min = min2 - min1;

      System.out.println(month + " " + day + " " + year + " " + hour + " hours " + min + " minutes");
    }

    reader.close();
  }
}
