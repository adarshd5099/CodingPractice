package main.unsorted.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CloseVowel {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int mod = 1000000007;
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine()), count = 1;
            String s = br.readLine();
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if (c == 'c' || c == 'r' || c == 'g' || c == 'l') {
                    count <<= 1;
                    count %= mod;
                }

            }
            System.out.println(count);
        }
    }
}
