public class Pattern3 {
    public static void main(String[] args) {
        int n=3;
        char alpha= 'A';
       for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= i; j++) {
              System.out.print(alpha);
          }
          alpha++;
          System.out.println();
       }
    }
}
