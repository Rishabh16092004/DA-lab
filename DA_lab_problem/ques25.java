import java.util.Scanner;

public class ques25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string :");
        String s = sc.nextLine();
        System.out.print("Enter sub string to append :");
        String s1 = sc.nextLine();
        s = s.concat(s1);
        System.out.println("String after concate : "+s);
    }
}
