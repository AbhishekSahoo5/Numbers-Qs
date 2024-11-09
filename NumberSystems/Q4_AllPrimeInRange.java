import java.util.*;
public class Q4_AllPrimeInRange {

    public static ArrayList<Integer> allPrime(int start,int end)
    {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=start;i<=end;i++)
        {
            if(checkPrime(i)){
                list.add(i);
            }
        }
        return list;
    }
    public static boolean checkPrime(int n)
    {
        if(n==1) return false;
        if(n==2 || n==3) return true;

        if(n%2==0 || n%3==0) return false;

        for(int i=5;i*i<=n;i++)
        {
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int start=10;
        int end=20;

        System.out.println(allPrime(start, end));
    }
    
}
