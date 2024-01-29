import java.util.*;

class Problem4{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int count=0;
        double sq= Math.sqrt(n);

        for(int i=2;i<=(int)sq;i++){
            if(n%i==0){
                System.out.print(i+" ");

                if(n/i!=i)
                System.out.print(n/i+" ");
                count++;
            }
        }
        if(count==0){
            System.out.println(-1);
        }
    }
}