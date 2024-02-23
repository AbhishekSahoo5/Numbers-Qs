package Maths.java;

public class _01_Factorial {

    public static int factorial(int n)
    {
        int res=1;
        for(int i=1;i<=n;i++)
        {
            res*=i;
        }
        return res;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(factorial(n));
    }
}
