package Section6;

public class DayOfTheWeek {

    public static void main(String[] args) {
        printDayOfTheWeek(3);
        printDayOfTheWeek2(88);
        printNumberInWord(5);
    }

    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.print("Sunday");
                break;
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
            default:
                System.out.print("Invalid number, please type number from 0 to 6");
        }
    }

    public static void printDayOfTheWeek2(int anotherDay) {
        if (anotherDay == 0) {
            System.out.print("Sunday");
        } else if (anotherDay == 1) {
            System.out.print("Monday");
        } else if (anotherDay == 2) {
            System.out.print("Tuesday");
        } else if (anotherDay == 3) {
            System.out.print("Wednesday");
        } else if (anotherDay == 4) {
            System.out.print("Thursday");
        } else if (anotherDay == 5) {
            System.out.print("Friday");
        } else if (anotherDay == 6) {
            System.out.print("Saturday");
        } else {
            System.out.print("Invalid number, please type number from 0 to 6");
        }

    }

    public static void printNumberInWord(int number) {
        switch (number) {
            case 0:
                System.out.print("ZERO");
                break;
            case 1:
                System.out.print("ONE");
                break;
            case 2:
                System.out.print("TWO");
                break;
            case 3:
                System.out.print("THREE");
                break;
            case 4:
                System.out.print("FOUR");
                break;
            case 5:
                System.out.print("FIVE");
                break;
            case 6:
                System.out.print("SIX");
                break;
            case 7:
                System.out.print("SEVEN");
                break;
            case 8:
                System.out.print("EIGHT");
                break;
            case 9:
                System.out.print("NINE");
                break;
            default:
                System.out.print("OTHER");
        }
    }
}

