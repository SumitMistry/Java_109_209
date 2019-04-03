import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Random;

import java.io.*;
import java.util.*;

public class WordCountTest {
    
    @Test
    public void scanWarAndPeace() throws IOException {
        WordCount wc = new WordCount();
        BufferedReader fr = new BufferedReader(
            new InputStreamReader(new FileInputStream("warandpeace.txt"), "UTF-8")
        );
        List<Integer> result = wc.processFile(fr);
        fr.close();
        assertEquals(result.get(0).intValue(), 3138473); // characters
        assertEquals(result.get(1).intValue(), 562491); // words
        assertEquals(result.get(2).intValue(), 63852); // lines
    }
}
