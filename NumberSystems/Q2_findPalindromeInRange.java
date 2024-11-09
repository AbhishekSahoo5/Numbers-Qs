import java.util.ArrayList;

public class Q2_findPalindromeInRange {

    public static boolean checkPalindrome(int n)
    {
        int temp=n;
        int reverse=0;
        while(temp>0){
            int digit=temp%10;
            reverse=reverse*10+digit;
            temp/=10;
        }
        if(reverse==n){
            return true;
        }
        return false;
    }
    public static ArrayList<Integer> allPalindrome(int min,int max)
    {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=min;i<=max;i++)
        {
            if(checkPalindrome(i)){
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int min=10;
        int max=50;
        System.out.println(allPalindrome(min, max));

    }
    
}
