import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadingUtils {

    public static ArrayList readNumbers(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        ArrayList<Integer> numbers = new ArrayList<>();

        try (Scanner scan = new Scanner(file)) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                numbers.add(Integer.parseInt(line));
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.err.println("Brak pliku!");
        }
        return numbers;
    }
}

