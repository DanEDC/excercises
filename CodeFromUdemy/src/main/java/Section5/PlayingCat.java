package Section5;

public class PlayingCat {

  public static void main(String[] args) {
    isCatPlaying(true, 30);
  }

  public static boolean isCatPlaying(boolean summer, int temperature) {

    if (summer && (temperature >= 25 && temperature <= 45)) {
      return true;
    }
    if (!summer && (temperature >= 25 && temperature <= 35)) {
      return true;
    } else {
      return false;
    }

  }
}
