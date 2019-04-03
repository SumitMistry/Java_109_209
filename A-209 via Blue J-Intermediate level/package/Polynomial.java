
/**
 * Write a description of class Polynomial here.
 *
 * @author (Sumit)
 * @version (209 of 2018date)
 */

import java.util.Arrays;

/**
 * Write a description of class Polynomial here.
 *
 */

public final class Polynomial implements Comparable<Polynomial>
{
    private int degree;
    private final int[] AAArray;
    private int[] coefficients;//creating new array
   
    
    //lab-1
    
    @Override public String toString()
    {
       return ("This Method's coeffient is"+ Arrays.toString(this.coefficients)) ; }
    

    public Polynomial(int[] coefficients)
    {
        AAArray=coefficients.clone();
        degree = coefficients.length-1;
        
        //or
        /*coeff = new int[degree+1];
        
        
        //skip 0,  {-1, 2, 0, 0, 0},>>>{-1, 2},// this part is if 
        for (int j=coefficients.length+1; j>0; j--) {
            if (coefficients[j]==0) {degree = degree-1;} //if some of the coeffi=0 then decreasing degree one by one.
            else if (coefficients[j]!=0) {break;}// if not 0 break whole for loop
        }

        ///-----------------{-1, 2}>>>>>>>> new{-1, 2} 
        coeff = new int[coefficients.length]; //create an array first=same as original array's length
        
        for(int i=0; i<coefficients.length; i++) {
              coeffs[i] = coefficients[i];} //then fill it up


              */

    }

    public int getDegree()
    {
        while(getCoefficient(degree)==0)
        {if (degree==0)
            {break;}
            degree=degree-1;
        }
        return degree;
    }

    public int getCoefficient(int k)
    {
        return AAArray[k];

    }    

    public int evaluate(int x)
    {
        int finalResult=0;
        int result=0;
        if (!(degree==0)){
            for(int i=1; i<=degree;i++)
            {
                int coefficient = AAArray[i];
                int power=1;
                for(int a=1; a<=i; a++)
                {
                    power*=x;
                }    
                int add = power*coefficient;
                result= result+ add;
                finalResult = AAArray[0]+result;
            }  
            return finalResult;
        }
        else return AAArray[0];
    }

    
    /////////lab-2
    
    
    private int degreeOfOther; 
    private int lengthOfOther; 
    private int[] coefficientsOfOther;
    private static final int[] MULTIPLIERS= { 547,619,877,1013,1163 }; //name constant

    
    
    public Polynomial add(Polynomial other)
    {
        int TotalOfSum=0;
        degreeOfOther = other.getDegree();
        lengthOfOther = degreeOfOther+1;
        coefficientsOfOther =  new int[lengthOfOther];
        
        for(int i=0; i<=degreeOfOther; i++)
            {coefficientsOfOther[i]=other.getCoefficient(i);}

            if(getDegree()>degreeOfOther || getDegree()==degreeOfOther) // we can adjust for the equality of degrees
                TotalOfSum = getDegree(); 
                else 
            TotalOfSum = degreeOfOther; //for adjusting degree#... if there are zeros previously.
            
            
        int[] coefficientsOfSum= new int[TotalOfSum+1];
        int x= TotalOfSum;
        for(int j=0; x>=0; x--)
        {
            if(getDegree()-degreeOfOther>j)
                coefficientsOfSum[x]=getCoefficient(x);
            else if(degreeOfOther-getDegree()>j)
                coefficientsOfSum[x]=coefficientsOfOther[x];
            else if(getDegree()-degreeOfOther<=j)
                coefficientsOfSum[x]=getCoefficient(x)+coefficientsOfOther[x];
            j++;
        }

        Polynomial sum= new Polynomial(coefficientsOfSum);
        return sum;    
    }

    public Polynomial multiply(Polynomial other)
    {
        int degreeOfProduct=0;
        int lengthOfProduct=0;
        degreeOfOther=other.getDegree();
        lengthOfOther = degreeOfOther+1;
        
        degreeOfProduct= this.getDegree()+other.getDegree();
        lengthOfProduct= degreeOfProduct+1;
        
        int[] coefficientsOfProduct=new int[lengthOfProduct];
        
        for(int i=0; i<lengthOfProduct; i++)
               coefficientsOfProduct[i]=0; 
               
        for(int k=0; k<=this.getDegree();k++)
        { 
            for(int j=0; j<=other.getDegree();j++)
            {coefficientsOfProduct[k+j]=this.getCoefficient(k)*other.getCoefficient(j)+coefficientsOfProduct[k+j];
            }
        }
        Polynomial product=new Polynomial(coefficientsOfProduct);    
        return product;
    }

    public int compareTo(Polynomial other)
    {
        int a=0;
        if (this.getDegree()>other.getDegree())
            a=1;
            
        else if (this.getDegree()<other.getDegree())
            a=-1;
            
        else
        {
            for(int i=this.getDegree(); i>=0; i--)
            {
                if (this.getCoefficient(i)>other.getCoefficient(i))
                {a= 1;break;}
                else if (this.getCoefficient(i)<other.getCoefficient(i))
                {a= -1;break;}
                else if (this.getCoefficient(i)==other.getCoefficient(i) && i==0)
                {a= 0;break;}
            }
        }
        return a;

    }

    
    
    
    
    
    //lab=3
    
    @Override public boolean equals(Object other)
    {
        boolean ans=false;
        
        if(other instanceof Polynomial && this.getDegree()==((Polynomial)other).getDegree())  
        {for(int i=0;i<=this.getDegree();i++)
            {
                if(this.getCoefficient(i)==((Polynomial)other).getCoefficient(i))
                    ans= true;
                else 
                {ans=false; 
                    break;}
            }    
            return ans;
        }
        else
            return false;
    }

    
    @Override public int hashCode()
    {
        int hashcode=0;
        for(int i=0; i<=this.getDegree(); i++)
        {
            hashcode+=this.getCoefficient(i) * MULTIPLIERS[i%5];
        }
        return hashcode;
    }
}