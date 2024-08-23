public class Q30_permutationsNpeopleCanOccupyRseats {

    public static int factorial(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact*=i;
        }
        return fact;
    }

    public static int permutation(int n,int r)
    {
        return factorial(n)/factorial(n-r);
    }

    public static void main(String[] args) {
        int n=5;
        int r=3;
        System.out.println(permutation(n, r));
    }
    
}
