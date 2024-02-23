package Maths.java;

public class _02_countNumberOfDigits {

    public static int noOfDigits(long n)
    {
        int count=0;
        while(n!=0){
            count++;
            n/=10;
        }
        return count;
    }

    public static void main(String[] args)
    {
        long n=123456789;
        System.out.println(noOfDigits(n));
    }
}
