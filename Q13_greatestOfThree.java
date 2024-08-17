public class Q13_greatestOfThree {
    public static void main(String[] args) {
        int num1=10;
        int num2=100;
        int num3=12;

        if(num1>num2 && num1>num3){
            System.out.println(num1+" is the great");
        }

        else if(num3>num2 && num3>num1){
            System.out.println(num3+" is the great");
        }
        else{
            System.out.println(num2+" is the great");
        }
    }
    
}
