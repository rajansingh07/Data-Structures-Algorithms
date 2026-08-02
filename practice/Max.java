import java.util.Scanner;
public class Max{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr [] = {10, 20, 30, 40, 50, 60};
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max element is : " + max);
    }
}