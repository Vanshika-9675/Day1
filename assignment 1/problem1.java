import java.util.Scanner;
class problem1{
     public static void main(String args[]){
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter the input string ");
        String input = myobj.nextLine();
        StringBuffer inp = new StringBuffer(input);

        for(int i=0;i<inp.length();i++){
            if(inp.charAt(i)>=65 && inp.charAt(i)<=90){
                 inp.setCharAt(i, (char)(inp.charAt(i) + 32));
            }
            else if(inp.charAt(i)>=97 && inp.charAt(i)<=122){
                inp.setCharAt(i, (char)(inp.charAt(i) - 32));
            }
        }
        System.out.println(inp);
     }
}




