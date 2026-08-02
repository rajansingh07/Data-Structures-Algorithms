import java.util.Scanner;

public class maxIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10, 30, 40, 60, 70, 80};
        int max = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        System.out.println("Max element index is : " + max);
    }
}
