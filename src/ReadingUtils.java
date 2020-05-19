import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ReadingUtils {

    public static List<Integer> readNumbers(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        ArrayList<Integer> numbers = new ArrayList<>();

        try (Scanner scan = new Scanner(file)) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                numbers.add(Integer.parseInt(line));
            }
        } catch (FileNotFoundException e) {
            System.err.println("Brak pliku!");
        }
        return numbers;
    }
}

