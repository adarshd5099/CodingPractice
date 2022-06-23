package main.unsorted.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * https://www.codechef.com/problems/SWAPCW
 */
class SwappingChefsWay {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            char[] array = s.toCharArray();
            char[] sorted = s.toCharArray();
            Arrays.sort(sorted);
            for (int i = 0; i < n; i++) {
                if (array[i] != sorted[i]) {
                    char temp = array[i];
                    array[i] = array[n - i - 1];
                    array[n - i - 1] = temp;
                }
            }
            System.out.println(new String(array).equals(new String(sorted)) ? "YES" : "NO");
        }
    }
}
