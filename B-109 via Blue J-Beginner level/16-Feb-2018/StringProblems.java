
/**
 * Write a description of class StringProblems here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringProblems
{
    // instance variables - replace the example below with your own
    private int x;

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

    /**         Q-1
     *          aabbbbbabbbbccccddd
     *          ababcd
     */

    public String removeDuplicates(String s) {
        StringBuilder result = new StringBuilder();

        for (int i=0; i <s.length(); i++) {
            char c=s.charAt(i);
            if (i == 0 ) {    // we need this because if string given is only "AB" or "A" then return same.
                result.append(c);
            }

            else if (s.charAt(i-1) != s.charAt(i)) { 
                // if (s.charAt(i) != s.charAt(i++) this is wrong
                // if (result.indexOf("" + c) < 0)        
                result.append(c);

            }
        }
        return result.toString();
    }


    /**         Q-2
     *          counts how many words there are in the parameter string s except wgite space
     *          and make sure 1'st=0th char or 5-1 th car is not white space
     *               
     */

    public int countWords(String s) {
        int count=0;

        for(int i = 0; i < s.length(); i++) {

            if (!Character.isWhitespace(s.charAt(i))) {
                if(i == 0 || Character.isWhitespace(s.charAt(i-1))) {
                    count++;
                }
            }

        }

        return count;
    }

    
    
    /**         Q-3
     *          first letter of each word is converted to title case
     *          
     */

    public String convertToTitleCase(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0 ; i <s.length(); i++) {
            char c = s.charAt(i);

            // same way as above you can use extra if if ((!Character.isWhitespace(c) && ( i==0 || Character.isWhitespace(s.charAt(i-1))))) {c = Character.toTitleCase(c);
            if ((!Character.isWhitespace(c) && ( i==0 || Character.isWhitespace(s.charAt(i-1))))) {
                c = Character.toTitleCase(c);
            }

            result.append(c); // this c goes into result, so value c is appended added into results
        }
        return result.toString();    // so result generated is converted into string from this Stringbulider
    }

    
    
    
    /**         Q-4
     *          Returns a String that contains each character that occurs in the given text, 
     *          ""so that each character is included in this result only once.""
     *          
     *          Hello there, world!",
     *          "Helo thr,wd!"
     */

    public String uniqueCharacters(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i <text.length(); i++) {
            char c = text.charAt(i);


            if (text.indexOf(text.charAt (i)) == i)
            {
                result.append(c);
            }

        }
        return result.toString();

    }  

                      
                      
}

