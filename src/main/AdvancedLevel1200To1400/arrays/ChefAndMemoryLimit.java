package main.AdvancedLevel1200To1400.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class ChefAndMemoryLimit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine()), i;
            int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int curr = 0;
            long sum = 0;
            for (i = 0; i < n; i++) {
                if (a[i] > curr)
                    sum += a[i] - curr;
                curr = a[i];
            }
            System.out.println(sum);
        }
    }
}
