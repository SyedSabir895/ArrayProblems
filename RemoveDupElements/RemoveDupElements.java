import java.util.Scanner;

public class RemoveDupElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            boolean seenBefore = false;
                        
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    seenBefore = true;
                }
            }

            if (!seenBefore) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}
