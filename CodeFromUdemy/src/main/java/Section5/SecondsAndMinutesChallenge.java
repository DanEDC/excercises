package Section5;

public class SecondsAndMinutesChallenge {

  private static final String INVALID_VALUE_MESSAGE = "Invalid value";

  public static void main(String[] args) {
    System.out.println(getDurationString(1000, 33));
    System.out.println(getDurationString(6788800));
  }

  public static String getDurationString(int minutes, int seconds) {
    if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
      int hours = minutes / 60;
      int leftMinutes = minutes % 60;
      return hours + "h " + leftMinutes + "m " + seconds + "s";
    } else {
      return INVALID_VALUE_MESSAGE;

    }
  }

  public static String getDurationString(int seconds) {
    if (seconds >= 0) {
      int minutes = seconds / 60;
      int leftSeconds = seconds % 60;
      int hours = minutes / 60;
      int leftMinutes = minutes % 60;
      return hours + "h " + leftMinutes + "m " + leftSeconds + "s";
    } else {
      return INVALID_VALUE_MESSAGE;
    }
  }

}
