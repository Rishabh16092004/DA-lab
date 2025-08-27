import java.util.Scanner;

public class ques22 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num;
        while(n>=10){
            int sum=0;
            while(n>0){
                sum+=n%10;
                n/=10;
            }
            n = sum;
        }
        System.out.println(n);
    }
}
