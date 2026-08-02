
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr [][] = new int [3][3];
        for(int i = 0; i <= arr.length - 1; i++){
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }


        int rowLength = arr.length;
        int colLength = arr[0].length;

        for (int k = 0; k < rowLength; k++) {     
            for(int l = 0; l < colLength; l++){
                System.out.print(arr[k][l] + " ");
            }   
            System.out.println( );
        }
    }
}