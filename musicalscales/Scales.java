import java.util.Scanner;

public class Scales { // TODO: Finish
  private static String[] notes = {"A","A#","B","C","C#","D","D#","E","F","F#","G","G#"};
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

  }



  private static int findNote(String note, String[] song){
    for (int i = 0; i < song.length; i++)
      if (note.equals(song[i]))
        return i;

    return -69;
  }

  private static int findNote(String note) {
    return findNote(note, notes);
  }
}
