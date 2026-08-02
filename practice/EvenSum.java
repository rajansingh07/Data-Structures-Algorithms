
import java.util.Scanner;

public class EvenSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % 2 == 0) {
                sum = sum + n;
            }
        }
        if (n % 2 == 0) {
            System.out.println("");
        } else {
            System.out.println("Odd number");
        }
        System.out.println(sum);
        sc.close();
    }
}
