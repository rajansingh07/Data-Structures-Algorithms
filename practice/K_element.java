public class K_element {
    public static void main(String[] args) {
        int arr[] = {4, 9, 2, 11, 7};
        for(int i = 1; i < arr.length; i++){
            int kVal = 5;
            if(arr[i] > kVal){
                System.out.println(arr[i]);
            }
        }
        
    }
}
