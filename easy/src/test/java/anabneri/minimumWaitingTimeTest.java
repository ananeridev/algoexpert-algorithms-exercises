package anabneri;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;
import sun.plugin.com.Utils;

public class minimumWaitingTimeTest {

    @Test
    public void TestCase1() {
        int[] queries = new int[]{3, 2, 1, 2, 6};
        int expected = 17;
        int actual = new minimumWaitingTime().minimumWaitingTime(queries);
        Assertions.assertTrue(actual == expected);
    }
}
