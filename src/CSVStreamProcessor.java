import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class CSVStreamProcessor {
    public static void calculateAverageAge(String csvFilePath) throws IOException {
        Path path = Path.of(csvFilePath);
       try(Stream<String> line = Files.lines(path)){ ;

       catch (Exception e) {
           throw new RuntimeException(e);
       }
    }



}
