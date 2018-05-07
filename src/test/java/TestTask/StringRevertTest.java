package TestTask;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringRevertTest {

    @Test
    public void revertString() {
        // given
        String source = "Java test";
        String expected = "tset avaJ";

        // when

        String result = StringRevert.revertString(source);

        // then
        assertEquals(expected, result);
    }
    @Test
    public void revertEmptyString() {
        // given

        // when

        String result = StringRevert.revertString("");

        // then
        assertEquals("", result);
    }
}