
/**
 * Write a description of class CardProblems here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CardProblems
{
    // instance variables - replace the example below with your own
    private int c;

    /**
     * Constructor for objects of class CardProblems
     */
    public CardProblems()
    {
        // initialise instance variables
        c=0;
   }

        
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
                    
    int rank;
    public int getRank(char c) {
        if  (c == 'T') { rank=10;} 
            else if(c>='2' && c<='9') {return Character.getNumericValue(c);} //*java utiliy class
            else if (c == 'J') { rank=11;}
            else if (c == 'Q') { rank=12;}
            else if (c == 'K') { rank=13;}
            else if (c == 'A') { rank=14;}
                              
        return rank;
    }
                       
     
        
   
    public boolean hasFlush(String hand){
        
    if (hand.charAt(1) == hand.charAt(3) &&
        hand.charAt(3) == hand.charAt(5) &&
        hand.charAt(5) == hand.charAt(7) &&
        hand.charAt(7) == hand.charAt(9)) {
        return true;
    }
        else {
        
        return false;
    }
}
    

    public boolean hasFourOfAKind(String hand){
                
    if (hand.charAt(0) == hand.charAt(2) && hand.charAt(2) == hand.charAt(4) && hand.charAt(4) == hand.charAt(6) ||
        hand.charAt(2) == hand.charAt(4) && hand.charAt(4) == hand.charAt(6) && hand.charAt(6) == hand.charAt(8) ||
        hand.charAt(0) == hand.charAt(2) && hand.charAt(2) == hand.charAt(4) && hand.charAt(4) == hand.charAt(8) ||
        hand.charAt(0) == hand.charAt(2) && hand.charAt(2) == hand.charAt(6) && hand.charAt(6) == hand.charAt(8) )
        {
        return true;
    }
        else{
        return false;
    }
}
   
    
    public boolean hasFourCardBadugi(String hand) {
     if  (hand.charAt(1) == hand.charAt(3)) { return false;}
     if    (hand.charAt(1) == hand.charAt(3)) { return false;}
     if    (hand.charAt(1) == hand.charAt(5)) { return false;}
     if    (hand.charAt(1) == hand.charAt(7)) { return false;}    
              
     if    (hand.charAt(3) == hand.charAt(5)) { return false;}
     if    (hand.charAt(3) == hand.charAt(7)) { return false;}

     if    (hand.charAt(5) == hand.charAt(7)) { return false;}
    
    
    
     if    (hand.charAt(0) == hand.charAt(2)) { return false;}
     if    (hand.charAt(0) == hand.charAt(4)) { return false;}
     if    (hand.charAt(0) == hand.charAt(6)) { return false;}
    
     if    (hand.charAt(2) == hand.charAt(4)) { return false;}
     if    (hand.charAt(2) == hand.charAt(6)) { return false;}
    
     if    (hand.charAt(4) == hand.charAt(6)) { return false;}
      
    
    else{
        return true;
    }   
    
}

}
