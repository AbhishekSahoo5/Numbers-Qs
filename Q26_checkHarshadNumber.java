public class Q26_checkHarshadNumber {

    public static boolean harshadNumber(int n)
    {
        int sum=0;
        int temp=n;
        while(temp>0){
            int digit=temp%10;
            sum+=digit;
            temp/=10;
        }
        return n%sum==0;
    }

    public static void main(String[] args) {
        int n=378;
        System.out.println(harshadNumber(n));
    }
    
}
