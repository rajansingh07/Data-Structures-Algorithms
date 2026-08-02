public class ArrayAverage {
    public static void main(String[] args) {
        int arr [] = {10, 20, 30};
        int total = arr.length;
        int sum = 0;
        for(int val : arr){
            sum = sum + val;
        }
        int average = sum / total;
        System.out.println(average);

    }
}
