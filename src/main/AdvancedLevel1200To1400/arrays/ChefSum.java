package main.AdvancedLevel1200To1400.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * https://www.codechef.com/problems-old/CHEFSUM
 */
class ChefSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()), pos = -1;
        while (t-- > 0) {
            int min = Integer.MAX_VALUE, n, i;
            n = Integer.parseInt(br.readLine());
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (i = 0; i < n; i++) {
                if (arr[i] < min) {
                    pos = i;
                    min = arr[i];
                }
            }
            System.out.println(pos + 1);
        }
    }
}
