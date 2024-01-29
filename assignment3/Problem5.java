import java.util.Scanner;
public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
            System.out.print(j);
            if(j+1<=i)
            System.out.print("+");
           }
           int sum=0;
            for (int j = 1; j <= i; j++) {
                sum+=j;
            }
            System.out.print("="+ sum);
            System.out.println();
        }
    }
}
