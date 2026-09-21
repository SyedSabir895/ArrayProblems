import java.util.Scanner;

public class Main {

    public static void findSubArray(int[] arr, double target) {

        for (int i = 0; i < arr.length; i++) {

            int sum = 0;

            for (int j = i; j < arr.length; j++) {

                sum += arr[j];

                int length = j - i + 1;

                double average = (double) sum / length;

                if (average == target) {

                    System.out.println("Subarray found:");

                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k] + " ");
                    }

                    System.out.println();
                    System.out.println("Average = " + average);

                    return;
                }
            }
        }

        System.out.println("No subarray found");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        double target = sc.nextDouble();

        findSubArray(arr, target);
    }
}