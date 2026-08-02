public class TwoArray {
    public static void main(String[] args) {
        int arr [][] = {
            {20, 30, 50},
            {40, 60, 80},
            {90, 62, 78}
        };

        int sum = 0;
        int RowLength = arr.length;
        int ColLength = arr[0].length;

        for(int i = 0; i < RowLength; i++){
            for(int j = 0; j < ColLength; j++){
                sum = sum + arr[i][j];
            }
        }
        System.out.println("Sum of 2-D Array is : " + sum);
    }
}
