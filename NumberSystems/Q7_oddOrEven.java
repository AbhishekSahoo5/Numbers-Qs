public class Q7_oddOrEven {

    public static String oddOrEven(int n)
    {
        if((n&1)==0){
            return "Even";
        }
        else{
            return "Odd";
        }
    }

    public static void main(String[] args) {
        int n=10;
        System.out.println(oddOrEven(n));

    }
    
}
