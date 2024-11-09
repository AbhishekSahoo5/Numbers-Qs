public class Q25_lcm {

    public static int lcm(int a,int b){
        int lcm;
        lcm=(a*b)/findgcd(a, b);
        return lcm;
    }

    public static int findgcd(int a,int b){
        while(a>0 && b>0){
            if(a>b){
                a=a%b;
            }
            else{
                b=b%a;
            }
        }
        if(a==0) return b;
        else return a;
    }
    public static void main(String[] args) {
        int n1=4;
        int n2=8;
        System.out.println(lcm(n1, n2));

    }
    
}
