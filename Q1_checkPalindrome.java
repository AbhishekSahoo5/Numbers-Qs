public class Q1_checkPalindrome{

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
    // Time complexity=O(logn)
    // Space complexity=O(1)
    public static void main(String[] args) {
        int num=00;
        System.out.println(checkPalindrome(num));

    }
}