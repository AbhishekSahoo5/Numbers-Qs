public class Q8_posOrNeg {

    public static String check(int n)
    {
        if(n>>31==0){
            return "Positive";
        }
        else if(n>>31==-1){
            return "Negative";
        }
        return "";
    }
    public static void main(String[] args) {
        System.out.println(check(-12));
    }
    
}
