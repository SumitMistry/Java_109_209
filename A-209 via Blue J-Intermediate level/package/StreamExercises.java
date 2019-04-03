import java.nio.file.*;
import java.io.*;
import java.nio.file.Files.*;
import java.util.stream.*;
import java.util.List;



public class StreamExercises
{
    public int countLines(Path path, int thres) throws IOException
    {
        Stream<String> lines = Files.lines(path);
        return(int)lines.filter(str -> str.length() >= thres).count();// -> aero denotes...
    }
    
    
    public List<String> collectWords(Path path) throws IOException
    {
        Stream<String> lines = Files.lines(path);
        
        Stream<String> words = lines.map(name -> name.toLowerCase()).flatMap(line -> Stream.of(line.split("[^a-z]+")));
        return words.filter(item -> item != null && !"".equals(item)).sorted().distinct().collect(Collectors.toList());
    }
}
