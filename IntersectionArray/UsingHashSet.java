package IntersectionArray;

import java.util.HashSet;
import java.util.Scanner;

public class UsingHashSet {
    public static void findIntersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }
        for (int num : arr2) {
            if (set.contains(num)) {
                result.add(num);
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
       
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
         int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = sc.nextInt();
        }

        findIntersection(arr1, arr2);
    }

}

