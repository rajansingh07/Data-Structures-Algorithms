public class CountNum {
    public static void main(String[] args) {
        int arr[] = {-1, -3 , -2 , 0, 1, 2, 3, 6, 7, 8};
        int CountPositive = 0;
        int CountNeagtive = 0;
        int CountZero = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                 CountPositive++;
            } else if (arr[i] < 0) {
                CountNeagtive++;
            } else {
                CountZero++;
            }
        }
        System.out.println("Positive Number Count : " +  CountPositive);
        System.out.println("Negative Number Count : " + CountNeagtive);
        System.out.println("Zero Number Count : " +  CountZero);
    }
}
