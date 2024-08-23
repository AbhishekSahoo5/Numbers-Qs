import java.util.ArrayList;

public class Q16_minMaxDigit{

    public static ArrayList<Integer> minMaxDigit(int n)
    {
        ArrayList<Integer> list=new ArrayList<>();
        int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;

        while(n!=0){
            int d=n%10;
            mini=Math.min(mini,d);
            maxi=Math.max(maxi,d);
            n=n/10;
        }
        list.add(maxi);
        list.add(mini);
        return list;

    }
    public static void main(String[] args) {
        int num=1234322345;
        ArrayList<Integer> list=minMaxDigit(num);
        System.out.println(list);

    }
}