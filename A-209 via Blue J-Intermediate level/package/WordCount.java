import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;
import java.io.*;

public class WordCount extends FileProcessor<List<Integer>>
{
    int characters;
    int words;
    int lines;
    
    @Override protected void startFile()
    {
        characters=0;
        words=0;
        lines=0;
    }
    
    @Override protected void processLine(String line) {
        lines++;
        
        if(line!=null && line.length()>0) {
        
        for (int i = 0; i < line.length(); i++) 
        {
            if(Character.isWhitespace(line.charAt(i))) {
             words++;
             characters++;
             if((i+1!=line.length())&& Character.isWhitespace(line.charAt(i+1)))
             words--;
         }
         else if(!Character.isWhitespace(line.charAt(i)))
               characters++;
        }
        
       if(!Character.isWhitespace(line.charAt(0)))
             words++;
       if(Character.isWhitespace(line.charAt(line.length()-1)))
             words--;
         }
       }
    @Override protected List<Integer> endFile()
    {
        List<Integer> list = new ArrayList<Integer>();
        list.add(characters);
        list.add(words);
        list.add(lines);
        return list;       
    }
}