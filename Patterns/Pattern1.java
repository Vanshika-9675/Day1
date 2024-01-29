
public class Pattern1 {
    public static void main(String[] args) {
        int n=4;
       for (int i = 1; i <= n; i++) {
          char alpha = (char)(64+i);
          for (int j = 1; j <= i; j++) {
              System.out.print(alpha);
              alpha++;
          }
          System.out.println();
       }
    }
    
}
