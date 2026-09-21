import java.util.Arrays;
import java.util.*;
public class MergeTwoArrays{
    public static void Merge(int []arr1, int m, int []arr2, int n){
        int []result = new int[m+n];
        for(int i=0;i<m;i++){
            result[i] = arr1[i];
        }
        for(int j=0;j<n;j++){
            result[m+j] = arr2[j];
        }
        Arrays.sort(result);
        for(int i=0;i<result.length;i++){
           arr1[i] = result[i];
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n1 = sc.nextInt();
        int []arr1 = new int[n1];
        System.out.println("Enter array elements");
        for(int i=0;i<arr1.length;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter non zero values size");
        int m = sc.nextInt();
        System.out.println("enter the size of array");
        int n2 = sc.nextInt();
        int []arr2 = new int[n2];
        System.out.println("Enter array elements");
        for(int j=0;j<arr2.length;j++){
            arr2[j] = sc.nextInt();
        }
        System.out.println("Enter non zero values size");
        int n = sc.nextInt();
        Merge(arr1,m,arr2,n);

    }
}