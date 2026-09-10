import java.util.Scanner;

public class SecondSmallestElement {
    public static int SecondLargest(int[]arr){
        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                secondsmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i]<secondsmallest && arr[i]!=smallest){
                secondsmallest = arr[i];
            }
        }
        return secondsmallest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }        
      int result = SecondLargest(arr);
        System.out.println(result);
    }
}
