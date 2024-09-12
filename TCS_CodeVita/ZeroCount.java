/*Error : White spaces yet passed the test cases */

import java.util.Scanner;

public class ZeroCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int K = sc.nextInt();
        if (K == 0) {
            System.out.println(L);
        } else if (K == L) {
            System.out.println(0);
        } else {
            int zeros = L - K;
            int blocks = K + 1;
            int minBlockSize = zeros / blocks;
            int extraZeros = zeros % blocks;
            if (extraZeros > 0) {
                System.out.println(minBlockSize + 1);
            } else {
                System.out.println(minBlockSize);
            }
        }
        sc.close();
    }
}
