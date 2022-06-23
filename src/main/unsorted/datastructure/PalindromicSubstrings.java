package main.unsorted.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PalindromicSubstrings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String ans = "No";
            String a = br.readLine();
            String b = br.readLine();
            for (int i = 0; i < a.length(); i++) {
                for (int j = 0; j < b.length(); j++) {
                    if (a.charAt(i) == b.charAt(j)) {
                        ans = "Yes";
                        break;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}