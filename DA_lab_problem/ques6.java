import java.util.Scanner;

public class ques6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int temp = num;
        double sum = 0;
        while(num>0){
            int rem = num%10;
            sum += Math.pow(rem,3);
            num = num/10;
        }
        if(sum==temp){
            System.out.print(temp + " is a Armstrong number.");
        }
        else{
            System.out.print(temp + " is not a Armstrong number.");
        }
    }
}
