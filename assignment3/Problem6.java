import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int reverse =0;
        while(n>0){
           reverse= reverse*10+ (n%10);
           n/=10;
        }
        System.out.println(original==reverse);
    }   
}
