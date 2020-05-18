import java.util.ArrayList;
import java.util.TreeSet;

public class ArrayUtils {

    public static TreeSet buildCollection(ArrayList numbers) {
        TreeSet<Integer> collection = new TreeSet<>(numbers);
        return collection;
    }

    public static Result[] compareData(TreeSet collection, ArrayList numbers) {
        Result[] results = new Result[collection.size()];
        ArrayList numbersToCheck = new ArrayList<>(collection);
//        System.out.println(numbersToCheck);

        for (int i = 0; i < numbersToCheck.size(); i++) {
            int index = 0;
            for (int j = 0; j < numbers.size(); j++) {
                if (numbersToCheck.get(i) == numbers.get(j)) {
                    index++;
                }
                results[i] = new Result((int) numbersToCheck.get(i), index);
            }
        } return results;
    }
}