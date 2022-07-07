package main.AdvancedLevel1200To1400.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.codechef.com/submit/HIRETEST
 */
class HireTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            int[] output = new int[100];
            for (int c = 0; c < n; c++) {
                int[] count = new int[3];
                char[] problemResult = br.readLine().toCharArray();
                for (int i = 0; i < m; i++) {
                    if (problemResult[i] == 'F') count[0]++;
                    else if (problemResult[i] == 'P') count[1]++;
                    else count[2]++;
                }
                if (count[0] >= x)
                    output[c] = 1;
                else if (count[0] == x - 1 && count[1] >= y)
                    output[c] = 1;
                else
                    output[c] = 0;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(output[i]);
            }
            System.out.println(sb);
        }
    }
}
