public class BarkingDog {

  public static void main(String[] args) {
    bark(true, 1);
  }

  public static boolean bark(boolean barking, int hourOfDay) {
    if (barking != false && hourOfDay >= 0 && hourOfDay < 8) {
      return true;
    }
    if (barking != false && hourOfDay > 22 && hourOfDay <= 23) {
      return true;
    } else {
      return false;
    }
  }
}
