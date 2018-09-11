package Section8.EncapsulationChallenge;

public class Printer {
    private double tonerLevel;
    private int numberOfPrintedPages;
    private boolean duplexPrint;

    public Printer(double tonerLevel, int numberOfPrintedPages, boolean duplexPrint) {
        if (tonerLevel >= 0 && tonerLevel <= 100.0) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.numberOfPrintedPages = numberOfPrintedPages;
        this.duplexPrint = duplexPrint;
    }

    public void fillTonerLevel() {
        this.tonerLevel = 100.0;
    }

    public void printPage() {
        this.numberOfPrintedPages += 1;
        this.tonerLevel -= 0.5;
    }

    public void printDuplex() {
        if (duplexPrint) {
            printPage();
            System.out.println("Duplex print have been processed");
        } else {
            System.out.println("Duplex print cannot be processed");
        }
    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPrintedPages() {
        return numberOfPrintedPages;
    }
}
