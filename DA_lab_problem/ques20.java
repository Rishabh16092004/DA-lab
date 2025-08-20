import java.util.Scanner;

public class ques20 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary number: ");
        String binary = sc.nextLine();
        int decimal = 0;
        int power = 0;
        for(int i=binary.length()-1;i>=0;i--){
            if(binary.charAt(i)=='1'){
                decimal += Math.pow(2,power);
            }
            power++;
        }
        System.out.println("Decimal value of "+binary+" is "+decimal);
    }
}
