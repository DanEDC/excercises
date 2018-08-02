package Section6;

public class NumberOfDaysInMonth {

    public static void main(String[] args) {
        getDaysInMonth(1, 2009);
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                //System.out.println(year + " is a leap year");
                return true;
            } else {
                //System.out.println("Not a leap year");
                return false;
            }
        }
        //System.out.println("Type year number in range of 1-9999");
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        } else {
            if (isLeapYear(year)) {
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        return 31;
                    //break;
                    case 2:
                        return 29;
                    //break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        return 30;
                    //break;
                }
            } else if (!isLeapYear(year)) {
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        return 31;
                    //break;
                    case 2:
                        return 28;
                    //break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        return 30;
                    // break;
                }

            }
        }

        return month;
    }

}




