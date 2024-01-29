import java.util.Scanner;

class Problem1{
         public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder binary = new StringBuilder();
        int remainder =0 ;
        while(n>0){
           remainder = n%2;
           n= n/2;
           binary.append(remainder);
        }
      
        binary.reverse();
       System.out.println(binary); 
    }
}