public class num{
    public static void main (String arg[]){
        int num = 5234;
        while(num != 0){
            int lastdigit = num % 10;
            System.out.print(lastdigit);
            num = num/10;
        }
    }
}