import java.util.Scanner;

public class ques12 {
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;  // remainder
            a = temp;
        }
        return a;
    }
    public static void  main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2=sc.nextInt();
        int gcd=findGCD(num1,num2);
        int lcm = num1*num2/gcd;
        System.out.println("The lcm of "+num1+" and "+num2+" is "+lcm);
    }
}
