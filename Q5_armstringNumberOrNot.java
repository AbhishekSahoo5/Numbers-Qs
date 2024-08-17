public class Q5_armstringNumberOrNot {

    public static boolean checkArnStrong(int n)
    {
        // String str=Integer.toString(n);
        // int len=str.length();
        // or
        int len=String.valueOf(n).length();
        int temp=n;
        int arm=0;
        while(temp>0){
            int digit=temp%10;
            arm+=Math.pow(digit, len);
            temp/=10;
        }
        if(arm==n) return true;
        else return false;
    }
    // Time complexity = O(logn)

    public static void main(String[] args) {
        int n=88593477;
        System.out.println(checkArnStrong(n));
    }
    
}
