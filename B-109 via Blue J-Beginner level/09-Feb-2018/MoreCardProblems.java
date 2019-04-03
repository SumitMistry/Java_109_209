/**
 * Write a description of class MoreCardProblems here.
 *
 * @author (Sumit Mistry)
 * @version (109 of 2018)
 */
public class MoreCardProblems
{
   
        
    public int bridgePointCount(String hand) {
        int count=0;
        for (int i=0; i<26; i+=2) { //* 0,2,4,6,8....even numbers only
            if (hand.charAt(i) == 'A') { count+=4;}
            else if (hand.charAt(i) == 'K') { count+=3;}
            else if (hand.charAt(i) == 'Q') { count+=2;}
            else if (hand.charAt(i) == 'J') { count+=1;}
        }
        return count;
    }
    
    
    
    public String bridgeHandShape(String hand) {
        int count=0, H=0, S=0, D=0, C=0; 
        
        for (int i=1; i < hand.length(); i=i+1) { //* 1,3,5,7,.odd numbers only = suits
            if (hand.charAt(i) == 'h') { H++;} //++ means add 1
            else if (hand.charAt(i) == 's') { S++;}
            else if (hand.charAt(i) == 'd') { D++;}
            else if (hand.charAt(i) == 'c') { C++;}
        }
        return (S+", "+H+", "+D+", "+C);
    }
       
    

    
    public int countDeadwood(String hand) {
        int count=0;
                            
        for (int i=0; i < hand.length(); i+=2) { //* 0,2,4,6,8....even numbers only = hands#
            char c = hand.charAt(i);
            if (c == 'A') { count = count +1;}
                else if (c == 'K' || c =='Q' || c=='J' || c == 'T') { count = count +10;}
                else if (c >='0' && c<='9') {count = count + Character.getNumericValue(c);}
            }
        return count;
    }
   
    
    
    
    
    
    public boolean hasFullHouse(String hand) {
        int counting=0;
              
        for (int i=0; i < hand.length(); i=i+2 ) {//* 0,2,4,6,8....even numbers only = hands#
                         
            for (int k=i + 2; k < hand.length(); k=k+2) { //* 0,2,4,6,8....even
                
                if (hand.charAt(i)== hand.charAt(k)) {counting++;}
            }             
        }
        
                if (counting==4) {
                return true;
                
                 
            }
        else {return false;}
        
    }

}
        
        