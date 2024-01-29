public class Pattern4 {
    public static void main(String[] args) {
        int n=5;
       for (int i = 1; i <= n; i++) {
          char alpha = (char)(70-i);
          for (int j = 1; j <= i; j++) {
              System.out.print(alpha);
              alpha++;
          }
          System.out.println();
       }
    }
}
