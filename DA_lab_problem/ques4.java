import java.util.Scanner;

public class ques4 {
    static int factorial(int rem) {
        int fact = 1;
        for (int i = 1; i <= rem; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        int temp = num;
        int sum = 0;
        while(num!=0){
            int rem = num%10;
            sum+=factorial(rem);
            num=num/10;
        }
        if(sum==temp){
            System.out.println(temp+" is a Strong number.");
        }
        else{
            System.out.println(temp+" is not a Strong number.");
        }
    }
}
