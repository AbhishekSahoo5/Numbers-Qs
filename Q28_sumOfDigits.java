public class Q28_sumOfDigits {

    public static int digitSum(int n){
        int sum=0;

        while(n>0){
            int digit=n%10;
            sum+=digit;
            n/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n=12345;
        System.out.println(digitSum(n));

    }
    
}
