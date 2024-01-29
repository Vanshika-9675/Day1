import java.util.Scanner;
class problem3{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = obj.nextInt();
        int count=0;
        while(n!=0){
            count++;
            n=n/10;
        }
        System.out.println(count);    
    }
}