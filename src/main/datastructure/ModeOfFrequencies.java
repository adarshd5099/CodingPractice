package main.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://www.codechef.com/problems/MODEFREQ
 */
class ModeOfFrequencies {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            Map<Integer, Integer> count = new HashMap<>();
            int[] count2 = new int[10001];
            br.readLine();
            Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).forEach(c -> count.merge(c, 1, Integer::sum));
            count.forEach((k, v) -> count2[v]++);
            int max = Arrays.stream(count2).max().orElse(0);
            for (int i = 0; i < 10001; i++) {
                if (count2[i] == max) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}