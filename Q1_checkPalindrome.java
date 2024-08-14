public class Q1_checkPalindrome {

    public static boolean isPlaindrome(int n)
    {
        int reverse=0;
        int temp=n;

        while(n>0){
            int t=n%10;
            reverse=(reverse*10)+t;
            n=n/10;
        }
        if(temp==reverse) return true;
        return false;


    }

    public static void main(String[] args) {
        int n=45454;
        System.out.println(isPlaindrome(n));
    }
    
}
