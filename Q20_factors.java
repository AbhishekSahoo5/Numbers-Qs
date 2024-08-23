import java.util.ArrayList;

public class Q20_factors {

    public static ArrayList<Integer> findFactors(int n){
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=1;i<Math.sqrt(n);i++)
        {
            if(n%i==0){
                if(n/i==i){
                    list.add(i);
                }
                else{
                    list.add(i);
                    list.add(n/i);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int n=21;
        ArrayList<Integer> list=findFactors(n);
        System.out.println(list);

    }
    
}
