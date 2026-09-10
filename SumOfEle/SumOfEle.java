import java.util.Scanner;

public class SumOfEle {
    public static void sumOfElements(int[] arr) {
        // int total = 0;
        int poscount = 0;
        int negcount = 0;
        // int search;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                poscount++;
            }

            else if (arr[i] < 0) {
                negcount++;
            }

        }
        System.out.println(poscount);
        System.out.println(negcount);
        // double result = (double)total/arr.length;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sumOfElements(arr);
        // System.out.println(sumOfElements(arr));

    }
}