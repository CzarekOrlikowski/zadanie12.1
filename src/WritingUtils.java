import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WritingUtils {

    public static void writeResult (String fileName, Result[] results) throws FileNotFoundException, IOException {

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter dane = new BufferedWriter(fileWriter);

            for (int i = 0; i < results.length; i++) {
                dane.write(results[i].getNumber() + " - liczba wystąpień: " + results[i].getAppearance());
                dane.newLine();
            }
            dane.close();
        } catch (
                IOException e) {
            System.err.println("Błąd zapisu pliku!");
        }
    }
}
