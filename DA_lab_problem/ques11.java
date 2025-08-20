import java.util.Scanner;

public class ques11 {
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;  // remainder
            a = temp;
        }
        return a;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr first number: ");
        int num1=sc.nextInt();
        System.out.print("Enetr second number: ");
        int num2=sc.nextInt();
        int gcd=findGCD(num1,num2);
        System.out.println("The gcd of "+num1+" and "+num2+" is "+gcd);
    }
}
