import java.util.Scanner;

public class ques8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        int sum = 0;
        for(int i=num1;i<=num2;i++){
            sum+=i;
        }
        System.out.println("The sum is "+sum);
    }
}
