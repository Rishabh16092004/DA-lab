import java.util.Scanner;

public class ques24 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your string : ");
        String s=sc.nextLine();
        s = s.trim();
        String rev = "";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        System.out.print("reverse string: "+rev);
    }
}
