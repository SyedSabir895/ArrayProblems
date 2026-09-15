package StocksProblem;

import java.util.Scanner;

public class MaxProfit{
    public static int Stocks(int []arr){
        int maxProfit = 0, bestBuy = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>bestBuy){
                maxProfit = Math.max(maxProfit, arr[i]-bestBuy);
            }
            bestBuy = Math.min(bestBuy,arr[i]);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int result = Stocks(arr);
        System.out.println(result);
    }
}