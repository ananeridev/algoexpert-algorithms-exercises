package anabneri;

import java.util.*;
import org.junit.Test;

public class minimumWaitingTimeTest {

    @Test
    public void TestCase1() {
        int[] queries = new int[]{3, 2, 1, 2, 6};
        int expected = 17;
        var actual = new minimumWaitingTime().minimumWaitingTime(queries);
        Utils.assertTrue(actual == expected);
    }
}
