package main.unsorted.datastructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class JamesAndMenus {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int m, n, i, j;
        long Ans = 0;
        n = Integer.parseInt(str.nextToken());
        m = Integer.parseInt(str.nextToken());

        int max = 10000;
        long[][] a = new long[max][max];
        long[] sum = new long[max];
        long[] ans = new long[max];
        long[] mx = new long[max];
        for (i = 0; i < n; i++) {
            str = new StringTokenizer(br.readLine());
            for (j = 0; j < m; j++) {
                a[i][j] = Integer.parseInt(str.nextToken());
                mx[j] = Math.max(a[i][j], mx[j]);
                sum[i] = sum[i] + a[i][j];
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                if (a[i][j] == mx[j]) ans[i]++;
                Ans = Ans > ans[i] ? Ans : ans[i];
            }
        }
        int index = -1;
        for (i = 0; i < n; i++) {
            if (ans[i] == Ans) {
                if (index == -1 || sum[i] > sum[index])
                    index = i;
            }
        }
        System.out.println(index + 1);
    }
}
