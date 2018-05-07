package TestTask;

import java.io.*;

public class FileReadUntilComa {


    public static String readFile(String absoluteFilePath) throws IOException {

        try (
                // InputStream
                InputStream inputStream = new FileInputStream(absoluteFilePath);
                // BufferedReader
                BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

        ) {
            StringBuilder builder = new StringBuilder();
            int i = br.read();
            while (i >= 0) {
                char c = (char) i;
                if (c == ',') {
                    break;
                }
                builder.append(c);
                i = br.read();
            }
            return builder.toString();
        }
    }
}
