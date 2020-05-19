import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayUtils {

    public static Set buildSingleNumbers(List numbers) {
        TreeSet<Integer> singleNumbers = new TreeSet<>(numbers);
        return singleNumbers;
    }

    public static Result[] createResult(Set singleNumbers, List numbers) {
        Result[] results = new Result[singleNumbers.size()];
        ArrayList numbersToCheck = new ArrayList<>(singleNumbers);
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