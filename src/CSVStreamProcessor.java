import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class CSVStreamProcessor {
    public static void calculateAverageAge(String csvFilePath) throws IOException {
        Path path = Path.of(csvFilePath);
       try(Stream<String> line = Files.lines(path)){
           List<String> list= line.skip(1)
                   .map(part -> part.split(","))
                   .filter(part -> part.length > 1 )
                   .map(part -> part[1].trim()).toList();

        OptionalInt sum = list.stream()
                .mapToInt(Integer::parseInt)
                .reduce(Integer::sum);

        double Average =  (double) (sum.isPresent() ? sum.getAsInt() : 0) /list.size() ;
       }
       catch (Exception e) {
           throw new RuntimeException(e);
       }
    }



}
