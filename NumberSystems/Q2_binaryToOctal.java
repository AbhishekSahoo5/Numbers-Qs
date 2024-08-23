
public class Q2_binaryToOctal {

    public static int binayToDecimal(String s)
    {
        int n=s.length();
        int base=1;
        int ans=0;

        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                ans+=base;
            }
            base*=8;
        }
        return ans;
        
    }

    public static void main(String[] args) {
        String s="1100110";
        System.out.println(binayToDecimal(s));
    }
    
}
