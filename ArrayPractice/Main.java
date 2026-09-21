package ArrayPractice;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String []arr = new String[sc.nextInt()];
        for(int i=0;i<=arr.length-1;i++){
            arr[i] = sc.next();
        }
        System.out.print("[");
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]);
            if(i!=arr.length-1){
                System.out.print(",");
            }
        }
        System.out.print("]");
;    }
}