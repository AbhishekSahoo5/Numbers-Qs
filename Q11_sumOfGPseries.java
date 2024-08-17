public class Q11_sumOfGPseries {

    public static float sumOfGP(float a, float r,int n)
    {
        float sum=(a*((float)Math.pow(r, n)-1))/(r-1);
        return sum;
    }
    // Sum of GP series formula = a(r^n-1)/(r-1)
    public static void main(String[] args) {
        float a=2,r=2;
        int n=4;
        System.out.println(sumOfGP(a, r, n));
    }
    
}
