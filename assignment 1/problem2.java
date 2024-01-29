import java.util.*;
import java.util.ArrayList;
class problem2{
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n= sc.nextInt();
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        int k=0;
        int j=arr.size()-1;
        while(k<j){
            Collections.swap(arr,k++,j--);
        }
        System.out.println(arr);
    }
}