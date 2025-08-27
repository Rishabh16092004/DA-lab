import java.util.Scanner;

public class ques28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enetr rows : ");
        int rows = input.nextInt();
        System.out.print("Enetr columns : ");
        int col = input.nextInt();
        int[][] A = new int[rows][col];
        int[][] B = new int[rows][col];
        int[][] C = new int[rows][col];
        System.out.println("Enter elements of matrix A : ");
        for (int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                A[i][j]=input.nextInt();
            }
        }
        System.out.println("Enter elements of matrix B : ");
        for (int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                B[i][j]=input.nextInt();
            }
        }

        for(int i=0;i<col;i++){
            for(int j=0;j<rows;j++){
                C[i][j]=A[i][j]+B[i][j];
            }
        }

        System.out.println("Matrix after addition : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
}
