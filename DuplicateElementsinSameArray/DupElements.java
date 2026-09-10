package DuplicateElementsinSameArray;
import java.util.Scanner;

public class DupElements {
    public static void DupEle(int []arr){
        for(int i=0;i<arr.length;i++){
            boolean duplicate  = false;
        for(int j=0;j<i;j++){
            if(arr[i]==arr[j]){
                duplicate  = true;
                break;
            }
        }
        if(duplicate){
            System.out.print(arr[i] + " ");
        }
        }
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int []arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        DupEle(arr);
    }
}
