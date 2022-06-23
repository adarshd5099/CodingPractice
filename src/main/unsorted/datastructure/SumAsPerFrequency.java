package main.unsorted.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class SumAsPerFrequency {
    public static void main(String[] args) throws IOException {
        Integer N, Q, r, l;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] count = new int[1000001];
        long[] sum = new long[1000001];
        for (int i = 0; i < N; i++) {
            count[Integer.parseInt(str[i])]++;
        }
        for (int i = 0; i < 1000001; i++) {
            sum[count[i]] += (long) count[i] * (long) i;
        }
        for (int i = 1; i < 1000001; i++) {
            sum[i] += sum[i - 1];
        }


        Q = Integer.parseInt(br.readLine());
        StringBuilder output = new StringBuilder();
        while (Q-- > 0) {
            StringTokenizer s = new StringTokenizer(br.readLine());
            l = Integer.parseInt(s.nextToken());
            r = Integer.parseInt(s.nextToken());
            long ans = sum[r] - sum[l - 1];
            output.append(ans);
            output.append("\n");
        }
        System.out.print(output);
    }
}
