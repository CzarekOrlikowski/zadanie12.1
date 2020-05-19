import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) throws IOException {


        ArrayList<Integer> numbers = (ArrayList<Integer>) ReadingUtils.readNumbers("dane.txt");
//        System.out.println(numbers);

        Set singleNumbers = ArrayUtils.buildSingleNumbers(numbers);
//        System.out.println(collection);

        Result[] results = ArrayUtils.createResult(singleNumbers, numbers);
//        for (Result result: results) {
//            System.out.println(result);
//        }
        WritingUtils.writeResult("wyniki.txt", results);
    }
}
