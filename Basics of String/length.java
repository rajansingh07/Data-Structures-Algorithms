// Find the length of the without using .length()?

public class length {
    public static void main(String[] args) {
        String name = "Rajan";
        int n  = 0;
        for(char ch : name.toCharArray()){
            n++;
        }
        System.out.println(n);
    }
}
