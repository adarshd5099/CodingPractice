package main.AdvancedLevel1200To1400.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * https://www.codechef.com/submit/CARVANS
 */
class CarVans {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int topSpeed = arr[0], count = 1;
            for (int i = 1; i < n; i++) {
                if (arr[i] <= topSpeed) {
                    count++;
                    topSpeed = arr[i];
                }
            }
            System.out.println(count);
        }
    }
}
