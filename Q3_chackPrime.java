public class Q3_chackPrime {

    public static boolean checkPrime(int n)
    {
        if(n<=1) return false;

        for(int i=2;i<n;i++)
        {
            if(n%i==0){
                return false;
            }
        }
        return true;
        /*
         * Time complexity =O(n)
         * Space complexity= O(1)
         */
    }
    
    // Approach 2
    //Idea: Approach always appear in pairs.
    public static boolean checkPrime2(int n){
        if(n<=1) return false;

        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0) return false;
        }
        return true;
        /*
         * Time complexity =O(Squareroot(n))
         */
    }

    // Approach 3
    // Idea: By checking n%2==0 and n%3==0, we can save many iterations for large n.
    public static boolean checkPrime3(int n){
        if(n==1) return false;

        if(n==2 || n==3) return true;

        if(n%2==0 || n%3==0) return false;

        for(int i=5;i*i<n;i=i+6)
        {
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
        /*
         * Time complexity =O(Squareroot(n)/3)
         */
    }


    public static void main(String[] args) {
        int n=101;
        System.out.println(checkPrime(n));
        System.out.println(checkPrime2(n));
        System.out.println(checkPrime3(n));
    }
    
}
