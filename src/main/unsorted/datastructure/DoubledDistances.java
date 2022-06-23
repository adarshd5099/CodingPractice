package main.unsorted.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class DoubledDistances {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String result = "Yes";
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
            for (int i = 1; i < n - 1; i++) {
                int l = arr[i] - arr[i - 1];
                int r = arr[i + 1] - arr[i];
                if (Math.max(l, r) != Math.min(l, r) * 2) {
                    result = "No";
                    break;
                }
            }
            System.out.println(result);
        }
    }
}
