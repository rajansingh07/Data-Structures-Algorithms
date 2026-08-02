// Print Sum of all numbers
public class sum{
    public static void main (String arg[]){
        int num = 5134;
        int sum = 0;
        while(num != 0){
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        System.out.println(sum);
    }
}