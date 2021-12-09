import java.io.*;
import java.util.*;

public class Solution 
{
    static boolean isPrime(int a)
    {
        for(int j=2;j<a;j++)
        {
            if(a%j==0)
            return false;
        }
        return true;
    }
    public static void main(String[] args) 
    {
         Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int i,j,sum;
        while(t-->0)
        {
            sum=0;
            int n=sc.nextInt();
            for(i=2;i<n;i++)
            {
                if(isPrime(i))
                {
                    if(isPrime(2*i+1))
                    {
                        sum=sum+i;
                    }
                }
            }
           System.out.println(sum);
        }
    }
}
