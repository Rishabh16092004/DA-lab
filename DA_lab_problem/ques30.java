import java.util.Scanner;

public class ques30 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rows=sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int cols=sc.nextInt();
        int[][] A=new int[rows][cols];
        int[][] B=new int[rows][cols];
        System.out.println("Enter the elements of the matrix : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("transpose of matrix A : ");
        for(int i=rows-1;i>=0;i--){
            for(int j=cols-1;j>=0;j--){
                B[j][i]=A[i][j];
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }
    }
}
