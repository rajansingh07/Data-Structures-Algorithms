import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element value : ");
        int arr[] = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of element you find : ");
        int x = sc.nextInt();
        boolean found = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                found = true;
                break;
            }
        }
        if(found == true){
            System.out.println("Element found ");
        } else {
            System.out.println("Element not found ");
        }
    }
}
