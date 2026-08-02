public class TwoDArray {
    public static void main(String args[]) {

        int arr[][] = {
            {10, 30, 40, 60},
            {80, 90, 100, 120},
            {130, 140, 150, 170}
        };

        int rowLength = arr.length;
        int colLength = arr[0].length;

        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}