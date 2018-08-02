package Section6;

public class SwitchStatementChallenge {

    public static void main(String[] args) {

        char myChar = '\u0046';

        switch (myChar) {
            case 'A':
                System.out.println("Char variable " + '\u0041' + " was found");
                break;

            case 'B':
                System.out.println("Char variable " + '\u0042' + " was found");
                break;

            case 'C':
                System.out.println("Char variable " + '\u0043' + " was found");
                break;

            case 'D':
                System.out.println("Char variable " + '\u0044' + " was found");
                break;

            case 'E':
                System.out.println("Char variable " + '\u0045' + " was found");
                break;

            default:
                System.out.println("Nothing has been found");

        }

    }
}

