public class Pattern7 {
    public static void main(String[] args) {
        int n= 5;
        for(int i=1;i<=n;i++){
           int num = i+(i-1);   
           int count = 1;
           for(int j=1;j<=n-i+1;j++)
             {
                System.out.print(num);
                num+=2;
             }
            for(int k = 1;k<i;k++){
                 System.out.print(count);
                 count+=2;
            }
             System.out.println();
        }
    }
}

