public class Q6_checkPerfectNumber {
    /*
     *  perfect number --> if sum of all divisors = original number
     *  
     */

     public static boolean checkPerfectNumber(int n)
     {
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            return true;
        }
        else{
            return false;
        }
        // Time complexity=O(n)

     }

     public static boolean checkPerfectNumber2(int n)
     {
        int sum=0;
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0){
                if(i==1|| i*i==n){
                    sum+=i;
                }
                else{
                    sum=sum+i+n/i;
                }
            }
        }
        if(sum==n){
            return true;
        }
        else{
            return false;
        }

        // Time complexity =O(Sqrt(n))
     }
    
    public static void main(String[] args) {
        int n=28;
        System.out.println(checkPerfectNumber(n));
        System.out.println(checkPerfectNumber2(n));
    }
}
