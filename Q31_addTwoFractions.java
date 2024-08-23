public class Q31_addTwoFractions {

    public static int gcd(int a,int b)
    {
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    
    public static void addTwoFractions(int num1,int den1,int num2,int den2,int numo,int deno)
    {
        int lcm=(den1*den2)/gcd(den1,den2);

        // new denominator
        int denoo=lcm;

        // new numerator 
        int numoo=num1*(deno/den1)+num2*(deno/den2);

        // common factor between numo and deno
        int gcd=gcd(numoo,denoo);

        // to simpliest form
        numoo/=gcd;
        denoo/=gcd;

        numo+=numoo;
        deno+=denoo;

    }

    public static void main(String[] args) {
        int num1=3,den1=4,num2=1,den2=7;    
        int numo=0,deno=0;
        addTwoFractions(num1, den1, num2, den2, numo, deno);
        System.out.println(num1+"/"+den1+"+"+num2+"/"+den2+"="+numo+"/"+deno);



    }
    
}
