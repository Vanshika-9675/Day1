import java.util.Scanner;
class problem4{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the string: ");
         String str = sc.nextLine();
        int vowels=0,consonants=0,other=0;
         for(int i=0;i<str.length();i++){
             char ch =str.charAt(i);
             if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                 vowels++;
             }
             else if(ch>=97 && ch<=122){
                consonants++;
             }
             else{
                other++;
             }
         }
         System.out.println(vowels+" "+consonants+" "+other);
    }
}