/**
 * Problem3
 */
public class Problem3 {

    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
               System.out.print(" ");
            }
            int count=i;
            for(int k=1;k<=i;k++){
                System.out.print(count++);
            }
            for (int j =2*i - 2; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}