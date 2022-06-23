package main.AdvancedLevel1200To1400.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * https://www.codechef.com/submit/COVID19
 */
public class Covid19 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            List<Integer> ans = new ArrayList<>();
            int n = Integer.parseInt(br.readLine());
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int i = 0; i < n; i++) {
                int l = i, r = i;
                while (l > 0 && Math.abs(arr[l] - arr[l - 1]) <= 2) l--;
                while (r < n - 1 && Math.abs(arr[r + 1] - arr[r]) <= 2) r++;
                ans.add(r - l + 1);
            }
            System.out.println(Collections.min(ans) + " " + Collections.max(ans));
        }
    }
}
