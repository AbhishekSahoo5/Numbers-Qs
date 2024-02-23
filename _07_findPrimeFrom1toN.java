package Maths.java;

public class _07_findPrimeFrom1toN {

    static void printPrimes(int n)
    {
        for(int i=2;i<=n;i++)
        {
            if(_06_primeOrNot.primeOrNot3(i))
            {
                System.out.println(i);
            }
        }
    }

    public static void sievePrimes(int n)
    {
        boolean [] prime =new boolean[n+1];
        for(int i=2;i<=n;i++)
        {
            if(prime[i]==false)
            {
                for(int j=i*2;j<=n;j=j+i)
                {
                    prime[j]=true;
                }
            }
        }
        for(int i=2;i<=n;i++)
        {
            if(prime[i]==false)
            {
                System.out.println(i);
            }
        }
    }

    public static void sievePrimes2(int n)
    {
        boolean [] prime =new boolean[n+1];
        for(int i=2;i<=n;i++)
        {
            if(prime[i]==false)
            {
                for(int j=i*i;j<=n;j=j+i)
                {
                    prime[j]=true;
                }
            }
        }
        for(int i=2;i<=n;i++)
        {
            if(prime[i]==false)
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
//        printPrimes(10);
//        sievePrimes(20);
        sievePrimes2(50);
    }
}
