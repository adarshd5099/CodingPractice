package main.AdvancedLevel1200To1400.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * https://www.codechef.com/submit/CHEFDETE
 */
public class ChefDetective {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] has_reports = new int[100001];
        int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < n; i++) {
            has_reports[a[i]] = 1;
        }
        for (int i = 0; i <= n; i++) {
            if (has_reports[i] == 0)
                System.out.print(i + " ");
        }
    }
}
