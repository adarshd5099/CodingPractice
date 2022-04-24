package main.BasicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class PuppyAndSum {
    static int sum(int n, int d) {
        if (d == 1) return (n * (n + 1)) / 2;
        else return sum((n * (n + 1)) / 2, d - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int ans = sum(arr[1], arr[0]);
            System.out.println(ans);
        }
    }
}
