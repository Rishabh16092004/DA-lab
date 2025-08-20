import java.util.Scanner;

public class ques10 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num =sc.nextInt();
        int count = Integer.bitCount(num);
        System.out.println("The number of set bit in "+num+" is "+count);
    }
}
