public class Q19_power {

    public static int power(int x,int n){
        int ans=1;
        for(int i=1;i<=n;i++){
            ans=ans*x;
        }
        return ans;
    }

    public static double power2(double x,int n){
        double ans=1;
        double oriNum=n;

        if(x==0 || x==1){
            return x;
        }
    }
    public static void main(String[] args) {
        int x=5;
        int n=3;
        System.out.println(power(x, n));

    }

}