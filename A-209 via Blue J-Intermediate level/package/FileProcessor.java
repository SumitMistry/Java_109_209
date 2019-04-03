import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;
import java.io.*;

public abstract class FileProcessor<R>
{
    
    
    protected abstract void startFile();
    protected abstract void processLine(String line);
    protected abstract R endFile();
    public final R processFile(BufferedReader in) throws IOException
    {
        startFile();
        String line = in.readLine();
        
        while (line != null) { 
            processLine(line);
            line = in.readLine();
        }
        
        in.close();
        return endFile(); 
    }
       
}

