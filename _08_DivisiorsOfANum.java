package Maths.java;

public class _08_DivisiorsOfANum {

    public static void printDivisors(int n)
    {
        //Brute force Approach
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
            }
        }
    }

    public static void printDivisors2(int n)
    {
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
                if(i!=(n/i)){
                    System.out.println(n/i);
                }
            }
        }
    }
    public static void printDivisors3(int n)
    {
        int i=0;
        for(i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
            }
        }
        for( ;i>=1;i--)
        {
            if(n%i==0 && i!=(n/i))
            {
                System.out.println(n/i);
            }
        }
    }
    public static void main(String[] args) {
//        printDivisors(25);
//        printDivisors2(25);
        printDivisors3(25);
    }
}
