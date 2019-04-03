import java.util.ArrayList; 



public class AccessCountArrayList<E> extends ArrayList<E> 
{
    
    private int count=0;
    
    @Override public E get(int k)//getter method
    {
        count++;
        return super.get(k);
    }
    @Override public E set(int k,E e) //setter method
    {
        count++;
        return super.set(k,e);
    }
    
     
    public int getAccessCount()
    {
        return count;
    }
    public void resetCount()
    {
        count=0;
    }
}
