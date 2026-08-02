import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(n % 2 != 0){
                sum = sum + n;
            }
        }
        if(n % 2 != 0){
            System.out.println("Sum of Odd number is : " + sum);
        } else {
            System.out.println("Given number is even!");
        }
    }
}
