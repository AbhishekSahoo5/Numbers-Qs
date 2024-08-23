import java.util.*;
public class Q17_fibonacciUptoNth {

    public static ArrayList<Integer> fibonacci(int n){
        ArrayList<Integer> list=new ArrayList<>();
        int secLast=0;
        int last=1;
        list.add(secLast);
        list.add(last);
        int current;
        for(int i=3;i<=n;i++)
        {
            current=secLast+last;
            secLast=last;
            last=current;
            list.add(current);
        }
        return list;
    }

    public static void main(String[] args) {
        
        int n=10;
        System.out.println(fibonacci(n));

    }
}
