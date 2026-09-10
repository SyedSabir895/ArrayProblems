import java.util.Scanner;

public class SearchNo {
    public static int SearchElem(int []arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int result = SearchElem(arr, target);
        if(result == -1){
            System.out.println("Target element not found");
        }
        else{
            System.out.println("Target found at index: " +result);
        }
    }
}
