package Section5;

public class MegaBytesConverter {

  public static void main(String[] args) {
    printMegaBytesAndKiloBytes(11);
  }

  public static void printMegaBytesAndKiloBytes(int kiloBytes) {
    if (kiloBytes < 0) {
      System.out.print("Invalid Value");
    } else {
      int megaBytes = kiloBytes / 1024;
      int remainingKiloBytes = kiloBytes % 1024;
      System.out
          .print(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
    }
  }
}
