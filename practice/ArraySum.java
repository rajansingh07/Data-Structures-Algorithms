public class ArraySum {
    public static void main(String[] args) {
        int arr [] = {2, 4, 6, 8, 10,};
        int sum = 0;
        for(int val : arr){
            sum = sum + val;
        }
        System.out.println("Sum of all elemnt is : " + sum);
    }
}
