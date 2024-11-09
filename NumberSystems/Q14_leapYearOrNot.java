public class Q14_leapYearOrNot {

    public static boolean isLeapYear(int year)
    {
        if((year%400==0)||(year%100!=0)&&(year%4==0)){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        int year=2000;
        System.out.println(isLeapYear(year));
    }
    
}
