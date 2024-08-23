public class Q23_Automorphic {

    public static boolean isAutomorphic(int n){
        int sq=n*n;

        while(n>0){
            if(n%10!=sq%10){
                return false;
            }
            n/=10;
            sq/=10;
        }
        return true;
    }

    public static void main(String[] args) {
        int n=25;
        System.out.println(isAutomorphic(n));

    }
    
}
