
/**
 * Write a description of class TwoDeeArrayProblems here.
 *
 * @author (Sumit)
 * @version (109 of 2018)
 */
public class TwoDeeArrayProblems
{

    
    public double[][] transpose(double[][] a) {
        // int row = a.length;
        // int col1 = a[0].length; // 1st full row becomes column
        // int z =a[0].length;   

        double [] [] b = new double [a[0].length][a.length]; 
        for (int i=0; i <a.length; i++) {    ///this is for iteration of row..up down down down

            for ( int j=0; j <a[0].length; j++) {   //this is for iteration of each individual row taking into as a column

                b[j][i] = a [i][j]; //main concept of this method swap is here..
            }

        }
        return b;
    }

    
    public double[] minValues(double[][] a) {
        double[] b = new double[a.length]; 
        double x = 0.0;

        for(int i = 0; i <  a.length; i++){
            if (a[i].length == 0){b[i]=0.0;}
            else {

                for(int j=1; j < a[i].length; j++){
                    x = a[i][j];

                    if (x < a[i][0]){
                        a[i][0] = x;
                    }

                }
                b[i] = a[i][0];

            }
        }

        return b;
    }

    public int[][] zigzag(int rows, int cols, int start) {
        int[][] a = new int[rows][cols];
        for(int i = 0; i < rows; i++) {
            if(i % 2 == 0) {
                for(int j = 0; j < cols; j++) { a[i][j] = start++; }
            }
            else {
                for(int j = cols - 1; j >= 0 ; j--) { a[i][j] = start++; }
            }
        }
        return a;
    }

    private double distance(double[] p1, double[] p2) {
        double sum = 0.0;
        for(int i = 0; i < p1.length; i++) {
            sum += (p1[i] - p2[i]) * (p1[i] - p2[i]);
        }
        return Math.sqrt(sum);
    }        

          double maximumDistance(double[][] pts)
  {
       int pts_rows= pts.length; 
       double max_dist=0;
       double dist1=0; 
       
       double [] p1i= new double [3];
       double [] p2i= new double [3];
       
      
        for(int j = 0; j < pts_rows; j++) 
        {
            p1i[0] = pts[j][0];
            p1i[1] = pts[j][1];
            p1i[2] = pts[j][2];
            
            
            for(int l = j+1; l< pts_rows; l++) 
            {                
               p2i[0] = pts[l][0];
               p2i[1] = pts[l][1];
               p2i[2] = pts[l][2];
               
              dist1 = distance(p1i,p2i); 
               if(dist1>max_dist)
               {
                max_dist=dist1;
               }
            }

        }
      return max_dist;
  }

        
}
    
    
