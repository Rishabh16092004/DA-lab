import java.util.Scanner;

public class ques9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter monthly expinditure : ");
        int monthlyexpinditure = sc.nextInt();
        System.out.println("Enter days in month : ");
        int days =  sc.nextInt();
        double dailyexpinditure = monthlyexpinditure/days;
        for(int i=1;i<=days;i++){
            System.out.println("Day " + i + ": " + dailyexpinditure);
        }
    }
}
