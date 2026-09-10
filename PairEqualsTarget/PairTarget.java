package PairEqualsTarget;

import java.util.Scanner;

public class PairTarget {
    public static void ParTar(int[] arr, int target) {
        // int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                int targetPair = arr[i] + arr[j];
                if (target == targetPair) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        ParTar(arr, target);
    }
}
