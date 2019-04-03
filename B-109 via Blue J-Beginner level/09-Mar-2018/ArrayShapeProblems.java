
/**
 * Write a description of class ArrayShapeProblems here.
 *
 * @author (Sumit Mistry)
 * @version (109 of 2018)
 */
public class ArrayShapeProblems
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class ArrayShapeProblems
     */
    public ArrayShapeProblems()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }

    public  int countUpsteps(int[] a) {
        int count= 0;
        for (int i=0; i < a.length-1; i++) {
            if (a[i] < a[i + 1]) {count++;}

        }
        return count;
    }

    public boolean sameStepShape(int[] a, int[] b) {
        for (int i=0; i < a.length-1; i++){

            if (!(( a[i] < a[i + 1])== (b[i] < b[i + 1] ) &&
                ( a[i] > a[i + 1])== (b[i] > b[i + 1] ) &&
                ( a[i] == a[i + 1])== (b[i] == b[i + 1] ))) 
            {  return false;  }

        }

        return true;
    }

    
    public boolean isSawtooth(int[] a) {
        if ( a.length <2) {return true;} // special

        for (int i=0; i < a.length-2; i++){

            if (a[i] == a[i + 1]) 
            {return false;}

            if (( a[i] < a[i + 1]) && ( a[i+1] < a[i + 2])) 
            {return false;}

            if (( a[i] > a[i + 1]) && ( a[i+1] > a[i + 2])) 
            {return false;}

        }

        if (a[a.length-1] == a[a.length-2]) { return false; } //if last 2 points
        //are same then do this..must
        return true;
    }

    

        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public boolean isMountain(int[] a){
        int j = 0;
        boolean result = false;
        int directionCCounter = 0;

        if (a[j+1] > a[j]){ //going up condition

            for(int i = 0; i < a.length - 2; i++){    
                if (a[i+1] > a[i]){
                    if (a[i+2] < a[i+1]){directionCCounter++;}
                }        

                if (a[i+1] < a[i]){
                    if (a[i+2] > a[i+1]){directionCCounter++;}
                }     
            }

            if (directionCCounter < 2){result = true;}
        }
        
        if (a[j+1] < a[j]){ //going up condition

            for(int i = 0; i < a.length - 2; i++){    
                if (a[i+1] > a[i]){
                    if (a[i+2] < a[i+1]){directionCCounter++;}
                }        

                if (a[i+1] < a[i]){
                    if (a[i+2] > a[i+1]){directionCCounter++;}
                }     
            }

            if (directionCCounter == 0){result = true;}
        }        
        
        return result;
    }

        
    
}   
        
        
        
        
        
        
     