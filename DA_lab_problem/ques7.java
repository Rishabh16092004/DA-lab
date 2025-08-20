import java.util.Scanner;

public class ques7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int temp = num;
        int rev = 0;
        while(num!=0){
            rev = rev*10 + num%10;
            num = num/10;
        }
        if(temp==rev){
            System.out.print(temp + " is a palindrome number.");
        }
        else{
            System.out.print(temp + " is not a palindrome number.");
        }
    }
}
