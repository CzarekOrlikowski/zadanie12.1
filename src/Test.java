import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) throws IOException {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers = ReadingUtils.readNumbers("dane");
//        System.out.println(numbers);

        TreeSet<Integer> collection = new TreeSet<>();
        collection = ArrayUtils.buildCollection(numbers);
//        System.out.println(collection);

        Result[] results = new Result[collection.size()];
        results = ArrayUtils.compareData(collection, numbers);

        WritingUtils.writeResult("wyniki.txt", results);

    }
}
