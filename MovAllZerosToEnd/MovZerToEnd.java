import java.util.ArrayList;
import java.util.Scanner;
public class MovZerToEnd{
    // public static void MovZeros(int[]arr){
    //     int index = 0;
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]!=0){
    //             arr[index] = arr[i];
    //             index++;
    //         }
    //         }
        
    //         while(index<arr.length){
    //             arr[index] = 0;
    //             index++;
    //         }
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i] + " ");
    //     }
    // }


    public static boolean isSorted(ArrayList<Integer> nums) {
    
        int count=1;
        for(int i=1;i<nums.size();i++){
            if(nums.get(i-1)<=nums.get(i)){
                count++;
                continue;
            }
            else{
                return false;
            }

        }
        if(count==nums.size()){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String []args){
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int []arr = new int[n];
        // for(int i=0;i<arr.length;i++){
        //     arr[i] = sc.nextInt();
        // }
        // MovZeros(arr);

        // import java.util.*;
        

        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(3);
        boolean res=isSorted(arr);
        System.out.println(res);
}
    }
