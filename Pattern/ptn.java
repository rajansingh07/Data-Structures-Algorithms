public class ptn {
    void print1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.err.println();
        }
    }
    public static void main(String args[]) {
        ptn obj = new ptn();
        obj.print1(6);
    }
}