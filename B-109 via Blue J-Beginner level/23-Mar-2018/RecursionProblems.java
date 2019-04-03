
/**
 * Write a description of class RecursionProblems here.
 *
 * @author (Sumit)
 * @version (109 of 2018)
 */
public class RecursionProblems
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class RecursionProblems
     */
    public RecursionProblems()
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
    
    
    
    
    public boolean allEqual(int[] arr, int start, int end) {
        
        if (start > end) {return true;} // array is empty
        if (start == end) {return true;} //array is 1 character        
        //if ( start >= end ) { return true;} // basecase: it is for 0 and 1 element array, we dont need those

        //After all, a subarray must by definition have at least two elements for it to have two different elements!
  
        //this line is same as below 2 lines;
        //return ((arr[start] == arr[start+1]) && ( allEqual(arr, start+1, end)));
        
        if ((arr[start] != arr[start+1])) {return false;}
        return ( allEqual(arr, start+1, end));
        
        }
    
        
        
    public void arraycopy(double[] src, int start, double[] tgt, int start2, int len) {
        //base case.........do nothing; when len is less than one
        // return (arraycopy(src, start+1, tgt, start2+1, len-1));
        
        if (len <1) {return;} //base case
        if (len ==0) {return;} //base case
        
        tgt[start2] = src[start]; //this only copy the 1st first element,
        // thisbelow mwthod copy rest elements not 1st
        arraycopy(src, start+1, tgt, start2+1, len-1);

    }
    
    
    
    
    public boolean linearSearch(int[] arr, int x, int start, int end) {
        
        if (start == end ) {return false;} //base case
        if (start >end )   {return false;} //base case
        if (arr[start] ==arr[end] ) {return false;} //base case
        if (arr[start]==x ) {return true;}  //base case sinply return
        
        //if (arr [start+1] arr[end]) {}

        return linearSearch(arr, x , start+1, end);
    
    }
     
    
    
    
    public void reverse(int[] arr, int start, int end) {
        
        if (start ==end ) {return ;} //base case
        if (start >end ) {return ;} //base case
        if (arr[start] ==arr[end] ) {return ;}  //base case
        
        int tmp= arr[end];
        arr[end] = arr[start];
        arr[start] =  tmp;
        
        
        reverse(arr, start+1, end-1);
    }
   
    
    
      
   

    public void parityPartition(int[] arr, int start, int end) {
        if (start >= end) {return;}
        
        if (arr[start] % 2 != 0) {
            parityPartition(arr, start + 1, end);}
        
        //else {
        if (arr[start] % 2 == 0) {
            int tmp = arr[end];
            arr[end] = arr[start];
            arr[start] = tmp;
            parityPartition(arr, start, end - 1);
        }
    }


        public int countRuns(int[] arr, int start, int end) {
        
        if (start > end) {return 0;}
        if(start == end) { return 1; }
        
        if (arr[start+1]!=arr[start]) {
            return 1 + countRuns(arr, start+1, end);            
        }
        else {
            return countRuns(arr, start+1, end);     
        }
    }
    
    
    
    
        
        
        
        
        
        
        
    }    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
