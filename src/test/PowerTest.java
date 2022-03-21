package powerpackage;

import org.junit.Test;

public class PowerTest {
    @Test
    public void oneRaisedToOneIsOne() {
        assert powerfinder.of(1, 1) == 1;
    }

    @Test
    public void twoRaisedToOneIsTwo() {
        assert powerfinder.of(2, 1) == 2;
    }

    @Test
    public void twoRaisedToTwoIsFour() {
        assert powerfinder.of(2, 2) == 4;
    }

    @Test
    public void threeRaisedToTwoIsNine() {
        assert powerfinder.of(3, 2) == 3 * 3;
    }
}
