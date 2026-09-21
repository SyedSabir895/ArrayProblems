import java.util.*;
public class main{
    public static int returnSum(int []arr){
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min1){
                min2 = min1;
                min1 = arr[i];
            }
            else if(arr[i]<min2 && arr[i]!=min1){
                min2 = arr[i];
            }
        }
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != min1 && arr[i] != min2){
                sum += arr[i];
            }
        }
         int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
              if(arr[i] != min1 && arr[i] != min2){
                if(arr[i]>max){
                    max = arr[i];
                }
              }
        }
        int result = sum-max;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
    int result = returnSum(arr);
    System.out.println(result);
    sc.close();
    }
}