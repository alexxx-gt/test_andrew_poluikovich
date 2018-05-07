package TestTask;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class FileReadUntilComaTest {

    @Test
    public void testReadFile() throws IOException {
        // given
        String fileName = "fileRead1.txt";
        String expected = "qazwsxedc";

        // when
        String result = FileReadUntilComa.readFile(getAbsoluteFilePath(fileName));

        // then
        assertEquals(expected, result);
    }

    private String getAbsoluteFilePath(String fileName) {
        File file = new File(this.getClass().getClassLoader().getResource(fileName).getFile());
        return file.getAbsolutePath();
    }
}