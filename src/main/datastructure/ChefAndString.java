package main.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.codechef.com/submit/RECNDSTR
 */
class ChefAndString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s = br.readLine();
            int l = s.length();
            String ls = s.substring(1) + s.charAt(0);
            String rs = s.charAt(l - 1) + s.substring(0, l - 1);
            System.out.println(ls.equals(rs) ? "YES" : "NO");
        }
    }
}
