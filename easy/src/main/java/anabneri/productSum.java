package anabneri;

import java.util.ArrayList;
import java.util.List;

public class productSum {
    // Tip: You can use `element instanceof ArrayList` to check whether an item
    // is an array or an integer.
    public static int productSum(List<Object> array) {
        return productSumHelper(array, 1);
    }

    public static int productSumHelper(List<Object> array, int multiplier) {
        int sum = 0;
        for (Object el : array) {
            if (el instanceof ArrayList) {
                @SuppressWarnings("unchecked")
                java.util.ArrayList<Object> ls = (ArrayList<Object>) el;
                sum += productSumHelper(ls, multiplier + 1);
            } else {
                sum += (int) el;
            }
        }

        return sum * multiplier;
    }
}
