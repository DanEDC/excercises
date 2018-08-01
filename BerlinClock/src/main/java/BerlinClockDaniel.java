
import java.util.Arrays;

public class BerlinClockDaniel {

    public static void main(String[] args) {
        berlinClock(24, 00);
    }

    private static void berlinClock(int hourNumber, int minutesNumber) {
        if (((hourNumber >= 0 && hourNumber <= 23) && (minutesNumber >= 0 && minutesNumber <= 59))) {
            int hourFirstRow = hourNumber / 5;
            int hourSecondRow = hourNumber - (hourFirstRow * 5);
            String[] firstRow = new String[4];
            for (int i = 0; i < firstRow.length; i++) {
                firstRow[i] = "0";
            }
            for (int j = 0; j < hourFirstRow; j++) {
                if (hourFirstRow < 5) {
                    firstRow[j] = "R";
                }
            }
            String[] secondRow = new String[4];
            for (int i = 0; i < secondRow.length; i++) {
                secondRow[i] = "0";
            }
            for (int j = 0; j < hourSecondRow; j++) {
                if (hourSecondRow < 5) {
                    secondRow[j] = "R";
                }
            }
            int minutesThirdRow = minutesNumber / 5;
            int minutesFourthRow = minutesNumber - (minutesThirdRow * 5);
            String[] thirdRow = new String[11];
            for (int i = 0; i < thirdRow.length; i++) {
                thirdRow[i] = "0";
            }
            for (int i = 0; i < minutesThirdRow; i++) {
                if (minutesThirdRow < 12) {
                    thirdRow[i] = "Y";
                }
            }
            String[] fourthRow = new String[4];
            for (int i = 0; i < fourthRow.length; i++) {
                fourthRow[i] = "0";
            }

            for (int i = 0; i < minutesFourthRow; i++) {
                if (minutesFourthRow < 5) {
                    fourthRow[i] = "Y";
                }
            }
            System.out.println(Arrays.toString(new String[]{"0"}));
            System.out.println(Arrays.toString(firstRow));
            System.out.println(Arrays.toString(secondRow));
            System.out.println(Arrays.toString(thirdRow));
            System.out.println(Arrays.toString(fourthRow));
            return;
        }

        if (hourNumber == 24 && minutesNumber == 0) {
            System.out.println(Arrays.toString(new String[]{"0"}));
            System.out.println(Arrays.toString(new String[]{"R", "R", "R", "R",}));
            System.out.println(Arrays.toString(new String[]{"R", "R", "R", "R",}));
            System.out.println(Arrays.toString(new String[]{"0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"}));
            System.out.println(Arrays.toString(new String[]{"0", "0", "0", "0"}));
        } else {
            System.out.println("Wrong number");
        }
    }
}

