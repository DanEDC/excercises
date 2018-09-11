package Section8.EncapsulationChallenge;

public class Main {

    public static void main(String[] args) {
        Printer computerPrinter = new Printer(22.6, 7, true);

        computerPrinter.printDuplex();
        computerPrinter.printPage();
        System.out.println(computerPrinter.getNumberOfPrintedPages());
        System.out.println(computerPrinter.getTonerLevel());
        computerPrinter.fillTonerLevel();
        System.out.println(computerPrinter.getTonerLevel());
    }
}
