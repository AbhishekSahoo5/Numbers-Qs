package Maths.java;
import java.util.*;
public class _06_primeOrNot {
    public static boolean primeOrNot(int n)
    {
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public static boolean primeOrNot2(int n)
    {
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static boolean primeOrNot3(int n)
    {
        if(n==1)
            return false;

        if(n==2 || n==3)
            return true;

        if(n%2==0 || n%3==0)
            return false;

        for(int i=5; i*i<=n; i=i+6)
        {
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(primeOrNot(17));
        System.out.println(primeOrNot2(17));
        System.out.println(primeOrNot3(40));
    }
}
