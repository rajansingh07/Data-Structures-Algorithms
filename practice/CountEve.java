public class CountEve {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int countEven = 0;
        int countOdd = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("Even number count is : " + countEven);
        System.out.print("Odd number count is : " + countOdd);
    }
}
