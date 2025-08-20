import java.util.Scanner;

public class ques19 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();
        String binary = "";

        int temp = num;
        while (temp > 0) {
            binary = (temp % 2) + binary;
            temp /= 2;
        }

        System.out.println("Binary representation of " + num + " is: " + binary);
    }
}
