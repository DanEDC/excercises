import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ReadSumWrite {


    public static void main(String[] args) throws IOException {

        {
            Scanner scanner = new Scanner(new File("D:\\Users\\502123448\\Desktop\\Work\\Git\\solutions-3-daniel-edc\\ReadSumWrite\\src\\main\\resources\\1000.txt"));
            FileWriter writer = new FileWriter("output.txt");
            while (scanner.hasNextLine()) {
                if (!scanner.hasNextInt()) {
                    scanner.nextLine();
                } else {
                    String line = scanner.nextLine();
                    Pattern pattern = Pattern.compile("\\s");
                    Scanner numbersScanner = new Scanner(line);
                    List<Integer> lineIntegers = new ArrayList<Integer>();
                    while (numbersScanner.hasNextInt()) {
                        lineIntegers.add(numbersScanner.nextInt());
                    }
                    if (!lineIntegers.isEmpty()) {
                        printComponents(writer, lineIntegers);
                    }
                }
            }
            writer.close();
        }
    }

    static void printComponents(Writer writer, List<Integer> l) throws IOException {
        StringBuilder builder = new StringBuilder("[");
        for (int i : l) builder.append(i).append(" + ");
        if (l.size() > 0) builder.deleteCharAt(builder.length() - 1);
        if (l.size() > 0) builder.deleteCharAt(builder.length() - 1);
        builder.append("= ").append(sum(l)).append("]").append('\n');
        writer.write(builder.toString());
    }

    static Integer sum(List<Integer> l) {
        Integer sum = 0;
        for (Integer i : l) {
            sum += i;
        }
        return sum;
    }

    // mapowanie
    /*static List<Integer> multiply(List<Integer> l, int multiplier) {
        List<Integer> result = new ArrayList<>();
        for (Integer element: l) {
            result.add(multiplier * element);
        }
        return result;*/
    }

    /** flatMap
     * [1, 2, 3] => [1, 5, 2, 10, 3, 15]
     */
    //static List<Integer> combinations(List<Integer> l, int multiplier) {









