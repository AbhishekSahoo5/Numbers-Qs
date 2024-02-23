package Maths.java;
import java.util.*;
public class _09_primeFactors {

    public static void primeFactors(int n)
    {
        int i=2;
        while(i*i<=n)
        {
            while(n%i==0)
            {
                System.out.println(i);
                n=n/i;
            }
            i++;
        }
        if(n>1)
        {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        primeFactors(900);
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(str);
    }
}
