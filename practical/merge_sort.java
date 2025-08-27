import java.util.Scanner;

public class merge_sort {
    public static void mergeSort(int[] arr,int low,int high) {
        if(low<high) {
            int mid = (low+high)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    public static void merge(int[] arr,int low,int mid,int high) {
        int n1=mid-low+1;
        int n2=high-mid;
        int leftarr[] = new int[n1];
        int rightarr[] = new int[n2];

        for(int i=0;i<n1;i++) {
            leftarr[i]=arr[low+i];
        }
        for(int j=0;j<n2;j++) {
            rightarr[j]=arr[mid+j+1];
        }
        int i=0,j=0,k=low;

        while(i<n1 && j<n2){
            if(leftarr[i]<=rightarr[j]){
                arr[k] =  leftarr[i];
                i++;
            }
            else{
                arr[k] =  rightarr[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k] =  leftarr[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] =  rightarr[j];
            j++;
            k++;
        }
    }
    public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array : ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the elements of the array : ");
            for(int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
            }
            mergeSort(arr,0,arr.length-1);
            System.out.println("Sorted array : ");
            for(int i=0;i<n;i++) {
                System.out.print(arr[i]+" ");
            }
    }
}
