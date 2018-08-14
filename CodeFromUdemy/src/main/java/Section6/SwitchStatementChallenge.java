package Section6;

public class SwitchStatementChallenge {

  public static void main(String[] args) {
    switchStatement('\u0043');
  }

  public static void switchStatement(char myChar) {

        switch (myChar) {
            case 'A':
              System.out.print("Char variable " + '\u0041' + " was found");
                break;

            case 'B':
              System.out.print("Char variable " + '\u0042' + " was found");
                break;

            case 'C':
              System.out.print("Char variable " + '\u0043' + " was found");
                break;

            case 'D':
              System.out.print("Char variable " + '\u0044' + " was found");
                break;

            case 'E':
              System.out.print("Char variable " + '\u0045' + " was found");
                break;

            default:
              System.out.print("Nothing has been found");

        }

    }
}

