import java.util.Scanner;
class problemm1{
     public static void main(String args[]){
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter the input string ");
        String inp = myobj.nextLine();
        char chArr[] = inp.toCharArray();
        for(int i=0;i<inp.length();i++){
            char charachter=inp.charAt(i);
            if(charachter>=65 && charachter<=90){
                 chArr[i] = (char)(charachter + 32);
            }
            else if(charachter>=97 && charachter<=122){
                chArr[i] = (char)(charachter - 32);
            }
        }
        System.out.println(chArr);
     }
}
