import java.util.Scanner;

public class ques31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row =  sc.nextInt();
        System.out.print("Enter number of columns: ");
        int column = sc.nextInt();
        int[][] A= new int[row][column];
        System.out.print("Enter elements of A: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                A[i][j] = sc.nextInt();
            }
        }
        int zerocount = 0;
        int total = row*column;
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                if(A[i][j]==0){
                    zerocount++;
                }
            }
        }
        if(zerocount>(row*column)/2){
            System.out.println("It is a sparse matrix.");
        }
        else{
            System.out.println("It is not a sparse matrix.");
        }
    }
}
