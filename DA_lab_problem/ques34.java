import java.util.Scanner;

public class ques34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base : ");
        double base=sc.nextDouble();
        System.out.print("Enter the height : ");
        double height=sc.nextDouble();
        double areaOfTriangle=0.5*base*height;
        System.out.println("The area of the triangle is : "+areaOfTriangle);
    }
}
