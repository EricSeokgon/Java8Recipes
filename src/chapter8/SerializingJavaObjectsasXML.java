package chapter8;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * Created by hadeslee on 2016-12-31.
 */
public class SerializingJavaObjectsasXML {
    private static ProgramSettings settings;

    public static void main(String[] args) throws IOException {
        //Encoding
        FileSystem fileSystem = FileSystems.getDefault();

        try (FileOutputStream fos = new FileOutputStream("settings.xml"); XMLEncoder encoder =
                new XMLEncoder(fos)) {
            encoder.setExceptionListener((Exception e) -> {
                System.out.println("Exception! :" + e.toString());
            });
            encoder.writeObject(settings);
        }
// Decoding
        try (FileInputStream fis = new FileInputStream("settings.xml"); XMLDecoder decoder =
                new XMLDecoder(fis)) {
            ProgramSettings decodedSettings = (ProgramSettings) decoder.readObject();
            System.out.println("Is same? " + settings.equals(decodedSettings));
        }
        Path file = fileSystem.getPath("settings.xml");
        List<String> xmlLines = Files.readAllLines(file, Charset.defaultCharset());
        xmlLines.stream().forEach((line) -> {
            System.out.println(line);
        });
    }
}
