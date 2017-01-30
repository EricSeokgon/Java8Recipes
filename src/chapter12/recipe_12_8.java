package chapter12;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/**
 * Project: Java8Recipes
 * FileName: recipe_12_8
 * Date: 2017-01-31
 * Time: 오전 8:31
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class recipe_12_8 {

    public String readStream() throws IOException {
        InputStream is = getClass().getResourceAsStream("resource/helloworld.sjis.txt");
        InputStreamReader reader = null;
        StringBuilder sb = new StringBuilder();
        if (is != null) {
            reader = new InputStreamReader(is, Charset.forName("SJIS"));
            int ch = reader.read();
            while (ch != -1) {
                sb.append((char) ch);
                ch = reader.read();
            }
            reader.close();
        }
        return sb.toString();
    }
}

