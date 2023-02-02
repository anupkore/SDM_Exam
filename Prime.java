import java.util.*;

class CheckPrime
{
    public void isPrime(int num)
    {
            int count=0;
        
            for(int i=1 ; i<=num ; i++)
            {
                int rem = num%i;
                if(rem==0)
                {
                    count++;
                }
                
            }
        
        if(count<3)
        {
            System.out.println(num);
            //System.out.println("Number is Not Prime");
        }
        //else
        //{
            
           // System.out.println("Number is Prime");
        //}
    }
}

public class Prime
{
    public static void main(String[] args) 
    {
        
        CheckPrime obj = new CheckPrime();
        for(int i=2 ; i<21 ;i++)
        {
        obj.isPrime(i);
        }
    }
}