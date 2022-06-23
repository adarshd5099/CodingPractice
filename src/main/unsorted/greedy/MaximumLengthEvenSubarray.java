package main.unsorted.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.codechef.com/submit/MXEVNSUB
 */
class MaximumLengthEvenSubarray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(((n * (n + 1)) / 2) % 2 == 0 ? n : n - 1);
        }
    }
}
