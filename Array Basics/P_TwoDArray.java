public class P_TwoDArray {
    public static void main(String[] args) {
        int arr [][] = {
            {20, 40, 60},
            {90, 120, 80},
            {82, 64, 74}
        };

        int product = 1;
        int rowLength = arr.length;
        int colLength = arr[0].length;

        for(int i = 0; i < rowLength; i++){
            for (int j = 0; j < colLength; j++) {
                product = product * arr[i][j];
            }
        }
        System.out.println("Multiplication of 2-D Array is : " + product);
    }
}
