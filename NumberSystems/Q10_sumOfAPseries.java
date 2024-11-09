public class Q10_sumOfAPseries {
    // Sum of AP series formula
    // n/2(2a+(n-1)d)

    public static float sumAp(float a,float d,int n){
        float sum=(n/2.0f)*(2.0f*a+(n-1)*d);
        return sum;
    }
    public static void main(String[] args) {
        float a=1.5f,d=3;
        int n=5;
        System.out.println(sumAp(a, d, n));
    }
    
}
