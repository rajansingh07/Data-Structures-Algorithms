public class Divisible {
    
    static void Funn() {
        int arr[] = {9, 10, 12, 15, 18, 20, 25, 30};
        int both = 0;
        int divBy3 = 0;
        int divBy5 = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 3 == 0 && arr[i] % 5 == 0){
                both++;
            } else if (arr[i] % 3 == 0){
                divBy3++;
            } else if (arr[i] % 5 == 0) {
                divBy5++;
            }
        }

        System.out.println("Number divisible by both 3 & 5 : " + both);
        System.out.println("Number dividsible by both 3 : " + divBy3);
        System.out.println("Number dividsible by both 5 : " + divBy5);
        
    }
    public static void main(String[] args) {
        Funn();
    }
}
