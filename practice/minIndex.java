import java.util.Scanner;

public class minIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr [] = {10, 20, 30, 40, 50, 60};
        int min = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[min]){
                min = i;
            }
        }
        System.out.println("Min element index is : " + min);
    }
}
