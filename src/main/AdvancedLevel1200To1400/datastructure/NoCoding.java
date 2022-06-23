package main.AdvancedLevel1200To1400.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class NoCoding {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s = br.readLine();
            int l = s.length();
            int current = s.charAt(0) - 97;
            int count = 2;
            for (int i = 1; i < l; i++) {
                int val = s.charAt(i) - 97;
                int diff = val - current;
                if (diff > 0) count = count + ++diff;
                else if (diff < 0) {
                    count = count + 25 - current + val + 2;
                } else {
                    count++;
                }
                current = s.charAt(i) - 97;
            }
            System.out.println(count <= 11 * l ? "YES" : "NO");
        }
    }
}
