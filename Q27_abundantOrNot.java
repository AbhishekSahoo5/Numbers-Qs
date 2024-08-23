public class Q27_abundantOrNot {

    public static boolean abundantOrNot(int n){
        int sum=0;
        for(int i=1;i<Math.sqrt(n);i++)
        {
            if(n%i==0){
                if(n/i==i){
                    sum=sum+i;
                }
                else{
                    sum=sum+i+n/i;
                }
            }
        }
        sum-=n;
        return sum>n;
    }

    public static void main(String[] args) {
        int n=18;
        System.out.println(abundantOrNot(n));
    }
    
}
