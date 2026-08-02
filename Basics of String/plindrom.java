public class plindrom {
    public static void main(String[] args) {
        String word = "BOOB";
        String reverse = new StringBuilder(word).reverse().toString();
        boolean isPlindrom = true;
        int n  = 0;
        for(int i = 0; i < word.length(); i++){
            char ch1 = word.charAt(i);
            char ch2 = reverse.charAt(i);
            if (ch1 != ch2){
                isPlindrom = false;
            }
        }
        if(isPlindrom){
                System.out.println("plindrom");
            } else {
                System.out.println("Not a Plindrom");
            }
    }
}
