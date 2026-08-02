public class vowel {
    public static void main(String[] args) {
        String word = "Rajan";
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u' || ch =='A' || ch =='E' || ch =='I' || ch =='O' || ch =='U') {
                count++;
            }
        }
        System.out.println("Vowel Count is : " + count);
    }
}
