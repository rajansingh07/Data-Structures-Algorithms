public class ptn2 {

    void pttn(int n) {
        for (int i = 0; i < n; i++) {
          for (int j = 0; j <= i; j++) {
            System.err.print("* ");
          }
          System.err.println();
        }
    }
    public static void main(String[] args) {
        ptn2 obj = new ptn2();
        obj.pttn(5);
    }
}
