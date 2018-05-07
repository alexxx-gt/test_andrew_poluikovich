package TestTask;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumWithoutPlusTest {

    @Test
    public void testSum() {
        // given
        int a = 123;
        int b = 9876;
        int expected = a + b;

        // when
        int result = SumWithoutPlus.sum(a, b);

        // then

        assertEquals(expected, result);
    }
}