package Maths.java;

public class _04_GCD_HCF {
    //Brute force Approach
    public static int GCDorHCF(int a, int b)
    {
        int min=Math.min(a,b);
        for(int i=min;i>=1;i--)
        {
            if(a%i==0 && b%i==0)
            {
                return i;
            }
        }
        return 1;
    }

    public static int euclidsGCD(int a,int b)
    {
        while(a!=b)
        {
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        return a;

    }
    public static int optiEuclidsGCD(int a,int b)
    {
        while(a!=0 && b!=0)
        {
            if(a>b)
                a=a%b;
            else
                b=b%a;
        }

        if(a!=0) 
            return a;
        else
            return b;
    }
    public static void main(String[] args) {
        int a=23;
        int b=21;
        System.out.println(GCDorHCF(a,b));
        System.out.println(euclidsGCD(a,b));
        System.out.println(optiEuclidsGCD(a,b));
    }
}
