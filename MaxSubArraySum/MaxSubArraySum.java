package MaxSubArraySum;

import java.util.Scanner;

public class MaxSubArraySum {
    public static void maxsubsum(int []arr){
        int CurSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            CurSum += arr[i];
            maxSum = Math.max(CurSum,maxSum);
            if(CurSum<0){
                CurSum=0;
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        maxsubsum(arr);
    }
}
