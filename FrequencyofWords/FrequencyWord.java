import java.util.Scanner;

public class FrequencyWord {
    public static void frequencyChecker(int []arr){
        for(int i=0;i<arr.length;i++){
            boolean seenBefore = false;

            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    seenBefore = true;
                    break;
                }
            }
            if(seenBefore){
                continue;
            }

            int count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            System.out.println(arr[i] + "->" + count);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        frequencyChecker(arr);
    }
}
