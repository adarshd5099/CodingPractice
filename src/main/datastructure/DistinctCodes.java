package main.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * https://www.codechef.com/problems/DISTCODE
 */
class DistinctCodes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            Set<String> set = new HashSet<>();
            String s = br.readLine();
            for (int i = 0; i < s.length() - 1; i++) {
                set.add(new StringBuilder().append(s.charAt(i)).append(s.charAt(i + 1)).toString());
            }
            System.out.println(set.size());
        }
    }
}
