package Maths.java;

public class _03_NoOfTrailingZeros {

    public static int findTrailingZeros(int n)
    {
        //Approach 1: First find the factorial and then count the number of zeros
        long res=1;
        for(int i=1;i<=n;i++)
        {
            res*=i;
        }
        int count=0;
        while(res%10==0)
        {
            count++;
            res/=10;
        }
        return count;
    }

    public static int findTrailingZeros2(int n)
    {
        int count=0;
        int powOf5=5;
        while(n>=powOf5)
        {
            count+=(n/powOf5);
            powOf5*=5;
        }
        return count;
    }



    public static void main(String[] args) {
        int n=200;
//        System.out.println(findTrailingZeros(n));
        System.out.println(findTrailingZeros2(n));
    }
}
