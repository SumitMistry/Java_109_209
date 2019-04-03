import java.util.List;
import java.util.ArrayList;


public class Tail extends FileProcessor<List<String>>
{
    private int n;
    private int lines;
    List<String> list1 = new ArrayList<String>();
    List<String> list2 = new ArrayList<String>();
    
    public Tail(int n)
    {
        this.n= n;
    }
    @Override public void startFile()
    {
        lines=0;
    }
    
    @Override public void processLine(String line)
    {
        lines++;
        list1.add(line);
    }
    
    @Override public List<String> endFile()
    {
        if (lines<=n)
        return list1;
        else 
        {
        for(int i =0; i< n;i++)
        {
            list2.add(i,list1.get(lines-n+i));
        }
        return list2;  
        }
    }
    
}
