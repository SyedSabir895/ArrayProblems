package WaterContainerProblem;
import java.util.Scanner;

public class WaterSum{
    public static int MaxSum(int []arr){
        int MaxSum = 0;
        int lp = 0, rp = arr.length-1;
        while(lp<rp){
            int w = rp-lp;
            int h = Math.min(arr[lp],arr[rp]);
            int CurrWater = w*h;
            MaxSum = Math.max(MaxSum, CurrWater);
            if(arr[lp]<arr[rp]){
                lp++;
            }
            else{
                rp--;
            }
        }
        return MaxSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int result = MaxSum(arr);
        System.out.println(result);        
    }
}