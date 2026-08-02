public class UniqueElement {
    public static void main(String[] args) {
        int arr [] = {1, 2, 3, 4, 6, 5, 6, 7};
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            count = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
             if(count == 1){
             System.out.println("Unique Element is : " + arr[i]);
             }
        }
    }
}
