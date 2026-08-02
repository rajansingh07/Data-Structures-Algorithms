// Print Count of all numbers
public class count {
    public static void main(String[] args) {
        int num = 513456679;
        int count = 0;
        while (num != 0){
            int digit = num % 10;
            count++;
            num = num / 10;
        }
        System.out.println(count);
    }
}
