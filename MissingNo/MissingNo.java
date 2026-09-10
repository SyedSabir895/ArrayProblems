import java.util.Scanner;

public class MissingNo {
    public static void MissNo(int []arr,int n){
        int expectedSum = n*(n+1)/2;
        int actualSum = 0;

        for(int i=0;i<arr.length;i++){
            actualSum = actualSum+arr[i];
        }
        int missing = expectedSum - actualSum;

        System.out.println("Missing number: " + missing);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n-1];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        MissNo(arr, n);
    }
}
