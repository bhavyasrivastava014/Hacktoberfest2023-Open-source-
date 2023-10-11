import java.io.*;
import java.util.*;

public class Solution {
    
    public static int partition(int arr[], int low, int high){
        int pivot=arr[high];
        int m=low-1;
        for(int j=low; j<high; j++){
            if(arr[j]<pivot){
                m++;
                
                int temp = arr[m];
                arr[m]=arr[j];
                arr[j]=temp;
            }
        }
        m++; 
        int temp = arr[m];
        arr[m]= pivot;
        arr[high]=temp;
        
        return m;
    }
    
    public static void quickSort(int arr[], int low, int high){
        if(low<high){
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex-1);
            quickSort(arr, pivotIndex+1, high);
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        
        quickSort(arr, 0, n-1);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
