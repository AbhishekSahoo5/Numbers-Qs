public class Q22_checkStrongNum {

    public static int factorial(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact*=i;
        }
        return fact;
    }

    public static boolean strongNum(int n){
        int temp=n;
        int sum=0;
        while(temp>0){
            int digit=temp%10;
            sum+=factorial(digit);
            temp/=10;
        }
        if(sum==n){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n=142;
        System.out.println(strongNum(n));
    }
    
}
