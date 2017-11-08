import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadSumWrite {


    public static void main(String[] args) throws FileNotFoundException {

        {
            Scanner scanner = new Scanner( new File( "D:\\Users\\502123448\\Desktop\\Work\\Git\\solutions-3-daniel-edc\\ReadSumWrite\\src\\main\\resources\\1000.txt" ) );
            while (scanner.hasNextLine()) {
                if (!scanner.hasNextInt()) {
                    scanner.nextLine();
                } else {
                    String line = scanner.nextLine();
                    Pattern pattern = Pattern.compile( "\\s" );
                    Matcher matcher = pattern.matcher( line ); // 1 2 5 6 -> OK /// 1 jakiś tekst -> Źle
                    Scanner numbersScanner = new Scanner( line );
                    List<Integer> lineIntegers = new ArrayList<Integer>();
                    while (numbersScanner.hasNextInt()) {
                        lineIntegers.add( numbersScanner.nextInt() );
                    }
                    printComponents( lineIntegers );
                    System.out.println( sum( lineIntegers ) );

                }
            }
        }
    }

    private static void printComponents(List<Integer> l) {
        StringBuilder builder = new StringBuilder( "[" );
        for (int i : l) builder.append( i ).append( " + " );
        if (l.size() > 0) builder.deleteCharAt( builder.length() - 1 );
        if (l.size() > 0) builder.deleteCharAt( builder.length() - 1 );
        builder.append( "= " ).append( sum( l ) ).append( "]" );
        builder.toString();
        System.out.println( builder );
    }

    private static Integer sum(List<Integer> l) {
        Integer sum = 0;
        for (int i = 0; i < l.size(); i++)
            sum += new Integer( l.get( i ) );
        {
            return sum;
        }

    }
}





