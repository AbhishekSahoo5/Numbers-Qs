import java.util.ArrayList;

public class Q2_findAllPalindromeNoInARange{

    public static ArrayList<Integer> palindromeInRange(int min, int max){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=min;i<=max;i++)
        {
            if(Q1_checkPalindrome.isPlaindrome(i)){
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int min=10;
        int max=50;
        System.out.println(palindromeInRange(min, max));

    }
}