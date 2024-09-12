/*Error : Whitespace yet passed the testcases */

import java.util.*;

class MinimumSwap {
    static int swapAsc(int[] arr) {
        int n = arr.length;
        int temp;
        int count = 0;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < (n - i - 1); j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count++;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
        return count;
    }

    static int swapDes(int[] arr) {
        int n = arr.length;
        int temp;
        int count = 0;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count++;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        in.close();

        int[] arrAsc = Arrays.copyOf(arr, arr.length);
        int[] arrDes = Arrays.copyOf(arr, arr.length);

        int swapsAscending = swapAsc(arrAsc);
        int swapsDescending = swapDes(arrDes);

        int minSwaps = Math.min(swapsAscending, swapsDescending);
        System.out.println(minSwaps);
    }
}
