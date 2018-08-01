public class LeapYearCalculator {

    public static void main(String[] args) {
        isLeapYear(1600);
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            int leapYear = year;
            if (leapYear % 4 == 0 && leapYear % 100 > 0 || leapYear % 400 == 0)
                return true;
        }
        return false;
    }
}


