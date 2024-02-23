package Maths.java;

public class _05_LCM {
    public static int LCM(int a,int b)
    {
        int max=Math.max(a,b);
        while(true)
        {
            if(max%a==0 && max%b==0)
            {
                return max;
            }
            max++;
        }
    }

    public static int euclidsLCM(int a, int b)
    {
        int gcd=_04_GCD_HCF.optiEuclidsGCD(a,b);

        return (a*b)/gcd;
    }
    public static void main(String[] args) {
        int a=7,b=3;
        System.out.println(LCM(a,b));
        System.out.println(euclidsLCM(a,b));
    }
}
