import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PowerTest {
    @Test
    public void oneRaisedToOneIsOne() {

        Assertions.assertEquals(PowerFinder.of(1, 1), 1);
    }

    @Test
    public void twoRaisedToOneIsTwo() {

        Assertions.assertEquals(PowerFinder.of(2, 1), 2);
    }

    @Test
    public void twoRaisedToTwoIsFour() {

        Assertions.assertEquals(PowerFinder.of(2, 2), 4);
    }

    @Test
    public void threeRaisedToTwoIsNine() {

        Assertions.assertEquals(PowerFinder.of(3, 2), 3 * 3);
    }
}
