import java.util.Arrays;
import java.util.Collections;

public class BerlinClock {

  private String formattedTime;
  private static final String NEW_LINE = System.getProperty("line.separator");



  public BerlinClock(String time) {

    String[] times = time.split(":", 3);

    if (times.length != 3){
      System.out.println("Wrong time format, should be HH:MM:SS");

    }


    int hours, minutes, seconds = 0;

    hours = Integer.parseInt(times[0]);
    minutes = Integer.parseInt(times[1]);
    seconds = Integer.parseInt(times[2]);

    if (hours < 0 || hours > 23)
      System.out.println("Hours out of bonds");
    if (minutes < 0 || minutes > 59)
      System.out.println("Minutes out of bonds");
    if (seconds < 0 || seconds > 59)
      System.out.println("Seconds out of bonds");

    this.formattedTime = processTime(hours, minutes, seconds);
  }

  private String processTime(int hours, int minutes, int seconds) {

    String line1 = (seconds % 2 == 0) ? "Y" : "0";
    String line2 = rowString(hours / 5, 4, "R");
    String line3 = rowString(hours % 5, 4, "R");
    String line4 = rowString(minutes / 5, 11, "Y").replaceAll("YYY", "YYR");
    String line5 = rowString(minutes % 5, 4, "Y");

    return String.join(NEW_LINE, Arrays.asList(line1, line2, line3, line4, line5));

  }

  private String rowString(int litLights, int lightsInRow, String lampType) {

    int unlitLights = lightsInRow - litLights;
    String lit = String.join("", Collections.nCopies(litLights, lampType));
    String unlit = String.join("", Collections.nCopies(unlitLights, "0"));

    return lit + unlit;
  }

  public void printClock() {
    System.out.println(this);
  }

  @Override
  public String toString() {
    return this.formattedTime;
  }
}
